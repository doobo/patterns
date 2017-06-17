package command;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());

        Invoke i = new Invoke(c);

        i.call();
    }
}
