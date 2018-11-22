public class Bus extends Vehicle{
    public Bus(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void speedUp(int increaseSpeed) {
        System.out.println("You are driving bus");
    }
}
