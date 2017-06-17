package factory.abstractfactory;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat{
    @Override
    public void message() {
        System.out.println("可按摩");
    }
}

class LowSeat implements Seat{
    @Override
    public void message() {
        System.out.println("不能按摩");
    }
}
