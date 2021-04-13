package wojtal.paulina;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Vehicle[] vehicles = {
                new Truck("BigTruck"),
                new RaceCar("Fastcar"),
                new Car("JustACar"),
                new Plane("Boeing"),
                new Ship("Ship")
        };

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
