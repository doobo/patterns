package state;

/**
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();

        ctx.setState(new CheckedState());;

    }
}
