package proxy.staticProxy;

/**静态代理模式
 * Created by doobo@foxmail.com on 2017/6/3.
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
    }
}
