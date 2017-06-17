package builder;
/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
