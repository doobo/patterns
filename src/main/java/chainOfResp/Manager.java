package chainOfResp;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){
            System.out.println("员工："+request.getEmpName()
            +",请假天数："+request.getLeaveDays()+",请假理由："+request.getReason());
            System.out.println("审批人：经理-"+this.name);
        }else {
            if(this.getNextLeader() != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
