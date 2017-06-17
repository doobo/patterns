package mediator;

/**
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public class Development implements Department {

    private Mediator m;//持有中介者（总经理）的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心研究，研发项目！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，需资金支持！");
    }
}
