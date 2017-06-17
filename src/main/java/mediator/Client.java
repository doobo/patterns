package mediator;

/**
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
