public class NewClass {
    public static void main(String[] args) {
        Exemple <Car,String> exemple =new Exemple<>();
        String vstring = "конечно же";


        Car car = new Car("лада",1997);
        Car car2 = new Car("лада",1998);
        Car car3 = new Car("лада",1999);
        exemple.addTOString(car,vstring);
        exemple.addTOString(car2,vstring);
        exemple.addTOString(car3,vstring);

        System.out.println(exemple.getMyString());

    }

}
