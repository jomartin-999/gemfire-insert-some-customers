package demo.gemfire.bulkload;

public class Product {
    private String name;
    private String department;
    private String material;
    private String color;
    private String price;
    private String promotionCode;
    private String guid;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setProductColor(String color) {
            this.color = color;        
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public void setGUID(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return this.guid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", promotionCode='" + promotionCode + '\'' +
                '}';
    }

}
