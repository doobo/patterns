package builder;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class Client {

    public static void main(String[] args) {
        AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());

        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName()+ship.getOrbitalModule().getName());
    }
}
