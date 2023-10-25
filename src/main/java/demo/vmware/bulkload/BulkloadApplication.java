package demo.vmware.bulkload;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

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
                .setPdxSerializer(new ReflectionBasedAutoSerializer("demo.vmware.bulkload.*"))
                .create();

        Region clusterRegion = clientCache.createClientRegionFactory(ClientRegionShortcut.PROXY).create("customer");

        Fairy fairy = Fairy.create();
        HashMap bulk = new HashMap();
        final AtomicLong counter = new AtomicLong(0);
        for (long i = 0; i < count; i++) {
            Person person = fairy.person();
            Customer customer = new Customer();
            customer.setFirstName(person.firstName());
            customer.setMiddleName(person.middleName());
            customer.setLastName(person.lastName());
            customer.setEmail(person.email());
            customer.setUsername(person.username());
            customer.setPassword(person.password());
            customer.setTelephoneNumber(person.telephoneNumber());
            customer.setDateOfBirth(person.dateOfBirth().toString());
            customer.setAge(person.age());
            customer.setCompanyEmail(person.companyEmail());
            customer.setNationalIdentificationNumber(person.nationalIdentificationNumber());
            customer.setNationalIdentityCardNumber(person.nationalIdentityCardNumber());
			customer.setGuid(UUID.randomUUID().toString());
            clusterRegion.put(customer.getGuid(), customer);
            System.out.println("Region " + clusterRegion.getName() + " has " + clusterRegion.keySetOnServer().size() + " entries.");
        }

    }
}
