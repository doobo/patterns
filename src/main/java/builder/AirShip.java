package builder;
/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

class OrbitalModule{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrbitalModule(String name) {
        this.name = name;
    }
}

class Engine{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {
        this.name = name;
    }
}