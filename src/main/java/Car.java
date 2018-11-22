public class Car extends Vehicle{

    public Car(String name,String brand){
        super(name,brand);
    }

    @Override
    public void speedUp(int increaseSpeed) {
        if(increaseSpeed <=200){
            super.speedUp(increaseSpeed);
        }else{
            System.out.println("Increase Speed cannot large than 200 km/h");
        }
    }
}
