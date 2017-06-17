package prototype;

import java.util.Date;

/**原型模式，也叫克隆模式
 * 也可以用序列化实现克隆-ByteArrayOutputStream
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class Sheep implements Cloneable {
    private String name;
    private Date birthday;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //继承父类Object的克隆方法
        Object obj = super.clone();
//        if(true) return obj;
        //添加如下代码实现深克隆（deep Clone)
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
