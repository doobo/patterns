package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**JDK自带动态代理测试
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader()
                ,new Class[]{Star.class},handler);

        proxy.bookTicket();
        proxy.sing();
    }
}
