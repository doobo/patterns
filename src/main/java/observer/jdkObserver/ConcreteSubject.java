package observer.jdkObserver;

import java.util.Observable;

/**
 * 主题,应该广播的信息state
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();//表示目标对象已经做了更改
        notifyObservers(state);
    }
}
