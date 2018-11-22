public class Driver {
    private Vehicle vehicle;
    private String name;
    public Driver(Vehicle vehicle,String name) {
        this.vehicle = vehicle;
        this.name = name;
    }

    public void speedUp(int increaseSpeed){
        vehicle.speedUp(increaseSpeed);
    }
}
