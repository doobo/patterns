package strategy;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice*0.85;
    }
}
