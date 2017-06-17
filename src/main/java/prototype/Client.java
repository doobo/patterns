package prototype;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * 浅克隆
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Date data = new Date();
        Sheep s1 = new Sheep("少利",data);
        Sheep s2 = (Sheep) s1.clone();

        data.setTime(1265453);

        System.out.println(data);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }
}
