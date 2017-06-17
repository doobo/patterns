package templateMethod;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();//办理具体的业务 //钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }

    //模版方法，把基本操作组合到一起，子类一般不能重写
    public final void process(){
        this.takeNumber();
        this.transact();//像一个钩子，挂哪个子类，就执行哪个方法
        this.evaluate();
    }
}
