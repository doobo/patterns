package observer;

/**
 *
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public interface Observer {
    void update(Subject subject);
}

class ObserverA implements Observer{
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
