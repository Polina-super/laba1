package laba1;

public class candy extends confectionery {
    private  String brand;

    candy (String type,  String color, double weight, String brand) {
        super.confectionery(type, color, weight);
        this.setBrand(brand);
        description = "Candy";
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {

        this.brand = brand;

    }
    public Object Description() {
        System.out.println(toString() + ". производитель - " + brand);
        return null;
    }
}
