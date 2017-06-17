package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK自带动态代理实现
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以设置返回值，
        //method.getName().equals("...") return method.invoke(realStar,args)
        return method.invoke(realStar,args);
    }
}
