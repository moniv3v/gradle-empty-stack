public class Vehicle {
    private String name;
    private String brand;
    private int speed;

    public Vehicle(String name, String brand){
        this.name = name;
        this.brand = brand;
        this.speed = 0;
    }

    public void speedUp(int increaseSpeed){
        speed += increaseSpeed;
        System.out.printf("Car %s in brand %s is in %d km/h\n",name,brand,speed);
    }
}
