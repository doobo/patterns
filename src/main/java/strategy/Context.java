package strategy;

/**
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离，使算法可以独立于客户端
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Context {
    private Strategy strategy;//当前采用的算法

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s){
        System.out.println("您需要付款："+strategy.getPrice(s));
    }
}

