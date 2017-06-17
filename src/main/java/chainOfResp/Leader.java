package chainOfResp;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    //设置责任链的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request );

}
