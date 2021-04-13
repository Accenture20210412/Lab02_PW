package wojtal.paulina;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Vehicle[] vehicles = new Vehicle[5];

        Vehicle v1 = new Truck("BigTruck");
        Vehicle v2 = new RaceCar("Fastcar");
        Vehicle v3 = new Car("JustACar");
        Vehicle v4 = new Plane("Boeing");
        Vehicle v5 = new Ship("Ship");

        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = v3;
        vehicles[3] = v4;
        vehicles[4] = v5;

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            v.go();
            v.stop();
            System.out.println(v.calcFuelEfficiency());
            if (v instanceof Plane) {
                ((Plane) v).callAirControl();
            }
        }
    }
}
