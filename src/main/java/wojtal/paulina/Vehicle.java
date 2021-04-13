package wojtal.paulina;

abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    double calcFuelEfficiency() {
        return getFuelNeeds()/getDistance();
    }

    void go() {
        System.out.println("Vehicle is on moving.");
    }

    void stop() {
        System.out.println("Vehicle stops.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
