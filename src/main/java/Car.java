public class Car {
   private String brand = "";
     private int year;

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand '").append(brand).append('\'');
        sb.append(", year ").append(year);
        sb.append('}');
        return sb.toString();
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}
