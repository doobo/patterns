package factory.abstractfactory;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("耐磨损");
    }
}

class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("易磨损");
    }
}