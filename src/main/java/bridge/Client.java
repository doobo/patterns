package bridge;

/**
 * 桥接模式测试
 * Created by doobo@foxmail.com on 2017/6/4.
 */
public class Client {
    public static void main(String[] args) {
        //销售联想笔记本
        Computer c = new Laptop2(new Lenovo());
        c.sale();

    }

}
