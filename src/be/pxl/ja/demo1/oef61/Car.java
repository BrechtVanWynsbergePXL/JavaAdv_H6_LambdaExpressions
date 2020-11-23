package be.pxl.ja.demo1.oef61;

public class Car {

    private Engine engine;
    private String fuel;

    public Car(String fuel){
        engine = new Engine();
        this.fuel = fuel;
    }

    public void start(){
        engine.start();
    }

    public class Engine{
        public void start(){
            System.out.println("Engine was started. Using fuel: " + fuel);
        }
    }

    public static void main(String[] args) {
        Car newCar = new Car("gass");
        newCar.start();

//        Engine newEngine = new Engine();
    }
}
