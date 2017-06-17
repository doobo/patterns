package adapter;

/**
 * 适配器
 * 相当于usb和ps/2的转接器
 * Created by doobo@foxmail.com on 2017/6/3.
 * 两种方式关联被适配器，对象适配器，
 *
 */
public class Adapter2 extends Adaptee implements Target {

    private Adaptee adaptee;

    @Override
    public void handleReq() {
      adaptee.handleReq();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
