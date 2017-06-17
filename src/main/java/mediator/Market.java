package mediator;

/**
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public class Market implements Department {

    private Mediator m;//持有中介者（总经理）的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，需要资金支持！");
        m.command("finacial");
    }
}
