package singleton;

/**
 * Created by doobo@foxmail.com on 2017/6/2.
 * 静态内部类,线程安全，能懒加载，并发高效调用，懒汉式的变种
 */
public class SingletonDemo3 {
    private static class LazyHolder {
        private static final SingletonDemo3 INSTANCE = new SingletonDemo3();
    }
    private SingletonDemo3 (){}
    public static final SingletonDemo3 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
