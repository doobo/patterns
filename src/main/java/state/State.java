package state;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public interface State {
    void handle();
}

class FreeState implements State{
    @Override
    public void handle() {
        System.out.println("空闲状态");
    }
}

class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预订");
    }
}

class CheckedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已入住");
    }
}
