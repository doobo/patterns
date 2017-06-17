package iterator;

/**
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aaa");
        cma.addObject("bbb");
        cma.addObject("ccc");

        MyIterator it = cma.createIterator();
        while (it.hasNext()){
            System.out.println(it.getCurrentObj());
            it.next();
        }
    }
}
