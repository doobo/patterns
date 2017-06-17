package factory.abstractfactory;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
