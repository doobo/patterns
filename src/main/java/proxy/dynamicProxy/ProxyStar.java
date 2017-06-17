package proxy.dynamicProxy;

/**
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class ProxyStar implements proxy.staticProxy.Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("面谈");
    }

    @Override
    public void signContract() {
        System.out.println("签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("订票");
    }

    @Override
    public void sing() {
       star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("收钱");
    }
}
