package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题，所有观察者的容器
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    //通知所有观察者更新状态
    public void notifyAllObserver(){
        for(Observer observer : list){
            observer.update(this);
        }
    }
}

class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //目标对象值发送变法，通知所有的观察者更改状态
        this.notifyAllObserver();
    }
}
