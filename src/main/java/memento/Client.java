package memento;

/**
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("高淇",18,900);

        taker.setMemento(emp.memento());

        emp.setAge(38);
        emp.setSalary(9000);

        emp.recovery(taker.getMemento()) ;
    }
}
