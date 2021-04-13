package wojtal.paulina;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 10000;
    }

    @Override
    public double getDistance() {
        return 3000;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane takes off.");
    }

    @Override
    public void land() {
        System.out.println("Plane lands.");
    }

    @Override
    public void callAirControl() {
        System.out.println("Please, call air control.");
    }

    @Override
    void go() {
        System.out.println("Plane is flying.");
    }

    @Override
    void stop() {
        System.out.println("Plane is not flying");
    }
}
