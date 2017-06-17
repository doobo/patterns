package observer.jdkObserver;

/**
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject sub = new ConcreteSubject();

        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        sub.addObserver(obs1);
        sub.addObserver(obs2);
        sub.addObserver(obs3);

        sub.setState(2000);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
