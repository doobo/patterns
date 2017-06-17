package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by doobo@foxmail.com on 2017/6/2.
 * 懒汉式,线程安全，能懒加载
 */
public class SingletonDemo2 implements Serializable {
    private static SingletonDemo2 ourInstance = null;

    public static synchronized SingletonDemo2 getInstance() {
        if(ourInstance == null){
            ourInstance = new SingletonDemo2();
        }
        return ourInstance;
    }

    private SingletonDemo2() {
        //解决反射多次创建实例的问题
        if(ourInstance != null){
            throw new RuntimeException("The Class was created");
        }
    }

    //解决反序列化时，再次创建实例的问题
    //反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要单独再次创建新对象！
    private Object readResolve() throws ObjectStreamException{
        return getInstance();
    }
}
