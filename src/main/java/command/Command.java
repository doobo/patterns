package command;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public interface Command {
    //这是一个返回结果为空的方法
    //实际项目中，可以根据需求设计多个不同的方法
    void execute();
}

class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //在调用前或者后可以进行相应的处理
        receiver.action();
    }
}