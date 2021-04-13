package wojtal.paulina;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Ship docks.");
    }

    @Override
    public double getFuelNeeds() {
        return 1500;
    }

    @Override
    public double getDistance() {
        return 5000;
    }

    @Override
    void stop() {
        System.out.println("Ship is not sailing.");
    }
}
