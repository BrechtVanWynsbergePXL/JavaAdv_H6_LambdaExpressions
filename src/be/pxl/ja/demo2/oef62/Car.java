package be.pxl.ja.demo2.oef62;

public class Car {

    private Engine engine;
    private static String fuel;

    public Car(String fuel){
        engine = new Engine();
        this.fuel = fuel;
    }

    public void start(){
        engine.start();
    }

    public static class Engine{
        public void start(){
            System.out.println("Engine was started. Using fuel: " + fuel);
        }
    }

    public static void main(String[] args) {
        Car newCar = new Car("gass");
        newCar.start();

        Engine newEngine = new Engine();
    }
}
