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
    }
}
