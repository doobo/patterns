package singleton;

/**
 * Created by doobo@foxmail.com on 2017/6/2.
 * 饿汉式,天然线程安全，不能延迟加载，当不需要延迟加载时，枚举单例比饿汉式好，无反射和序列化漏洞
 */
public class SingletonDemo1 {
    private static SingletonDemo1 ourInstance = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return ourInstance;
    }

    private SingletonDemo1() {
    }
}
