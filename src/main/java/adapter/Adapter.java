package adapter;

/**
 * 适配器
 * 相当于usb和ps/2的转接器
 * Created by doobo@foxmail.com on 2017/6/3.
 * 两种方式关联被适配器，extends，类适配器，不够灵活；
 * 对象适配器，看Adapter2
 *
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
       super.handleReq();
    }
}
