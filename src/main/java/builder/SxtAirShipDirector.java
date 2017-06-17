package builder;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class SxtAirShipDirector implements AirShipDirector {
    private AirShipBuilder airShipBuilder;

    public SxtAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e = airShipBuilder.builderEngine();
        OrbitalModule o = airShipBuilder.builderOrbitalModule();
        EscapeTower et = airShipBuilder.builderEscapeTower();
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }
}
