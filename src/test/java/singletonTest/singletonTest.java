package singletonTest;

import org.junit.Test;
import singleton.SingletonDemo2;
import singleton.SingletonDemo4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by doobo@foxmail.com on 2017/6/2.
 */
public class singletonTest {

    //枚举单例
    @Test
    public void enumSingleton(){
        System.out.println(SingletonDemo4.INSTANCE == SingletonDemo4.INSTANCE);

    }

    //反序列号漏洞解决方案测试
    @Test
    public void bugSingletonDemo2() throws Exception{
        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        FileOutputStream out = new FileOutputStream("d:/temp/a.ob");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(s2);
        oos.close();out.close();

        serializableSingleton();
    }

    private void serializableSingleton() throws Exception{
        ObjectInputStream ois =new ObjectInputStream(
                new FileInputStream("d:/temp/a.ob"));
        SingletonDemo2 s3 = (SingletonDemo2) ois.readObject();

        System.out.println(s3);
        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}
