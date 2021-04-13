package wojtal.paulina;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 50;
    }

    @Override
    public double getDistance() {
        return 100;
    }
}
