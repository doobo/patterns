package strategy;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Client {

    public static void main(String[] args) {
        Context c = new Context(new NewCustomerFewStrategy());

        c.printPrice(100);
    }
}
