package mediator;

/**
 *同事类接口
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public interface Department {

    void selfAction();//做本部门的事情
    void outAction();//向总经理发出申请
}
