package state;

/**
 * 如果是银行系统，这个Context类就是帐号
 * 根据帐号金额不同，切换不同的状态
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Context {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }

    public State getState() {
        return state;
    }
}
