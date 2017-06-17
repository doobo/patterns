package factory;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
