/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Vehicle vehicleA = new Vehicle("A","BMW");
        vehicleA.speedUp(30);
        Vehicle vehicleB = new Vehicle("B","Benz");
        vehicleB.speedUp(40);

        Car car = new Car("My car","Goodbye");
        car.speedUp(180);
        car.speedUp(201);

        Vehicle bus = new Bus("My Bus","OOCL");
        bus.speedUp(70);
        bus.speedUp(100);

        Driver tommy = new Driver(vehicleA,"Tommy");
        tommy.speedUp(50);

        Driver jacky = new Driver(car,"Jacky");
        jacky.speedUp(111);

        Driver baby = new Driver(bus,"Baby");
        baby.speedUp(666);
    }
}
