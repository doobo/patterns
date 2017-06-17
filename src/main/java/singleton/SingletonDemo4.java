package singleton;

/**
 * Created by doobo@foxmail.com on 2017/6/2.
 * 枚举单例,不能懒加载,Jvm保证线程安全，避免反射和反序列化漏洞
 */
public enum SingletonDemo4 {
    //枚举本身就是单例
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation(){

    }

}
