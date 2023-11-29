package demo.gemfire.bulkload;

import com.github.javafaker.Commerce;
import com.github.javafaker.Faker;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class BulkloadApplication {

    public static void main(String[] args) {

        int count = 1000;
        try {
            count = Integer.parseInt(args[0]);

        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        ClientCache clientCache = new ClientCacheFactory()
                .setPdxReadSerialized(false)
                .addPoolLocator("localhost", 10334)
                .setPdxSerializer(new ReflectionBasedAutoSerializer("demo.gemfire.bulkload.*"))
                .create();

        Region clusterRegion = clientCache.createClientRegionFactory(ClientRegionShortcut.PROXY).create("products");

        Faker faker = new Faker();


        final AtomicLong counter = new AtomicLong(0);
        for (long i = 0; i < count; i++) {
            Commerce commerce = faker.commerce();
            Product product = new Product();
            product.setName(commerce.productName());
            product.setDepartment(commerce.department());
            product.setMaterial(commerce.material());
            product.setProductColor(commerce.color());
            product.setPrice(commerce.price());
            product.setPromotionCode(commerce.promotionCode());
            product.setGUID(UUID.randomUUID().toString());
            clusterRegion.put(product.getGuid(), product);
            System.out.println("Region " + clusterRegion.getName() + " has " + clusterRegion.keySetOnServer().size() + " entries.");
        }

    }
}
