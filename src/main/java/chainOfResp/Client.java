package chainOfResp;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.nextLeader = b;
        b.nextLeader = c;

        //请假测试
        LeaveRequest req1 = new LeaveRequest("TOM",9,"回英国老家探亲");
        a.handleRequest(req1);

        req1 = new LeaveRequest("TOM",1,"回英国老家探亲");
        a.handleRequest(req1);

        req1 = new LeaveRequest("TOM",25,"回英国老家探亲");
        a.handleRequest(req1);

    }
}
