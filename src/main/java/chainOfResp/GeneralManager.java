package chainOfResp;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<30){
            System.out.println("员工："+request.getEmpName()
            +",请假天数："+request.getLeaveDays()+",请假理由："+request.getReason());
            System.out.println("审批人：总经理-"+this.name);
        }else {
            System.out.println("莫非，"+request.getEmpName()+"，想辞职，居然请假："+request.getLeaveDays()+"天。");
        }
    }
}
