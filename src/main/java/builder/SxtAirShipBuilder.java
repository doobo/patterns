package builder;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class SxtAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        return new Engine("尚学堂发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        return new OrbitalModule("尚学堂轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("尚学堂逃逸塔");
    }
}
