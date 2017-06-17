package strategy;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
