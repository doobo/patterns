package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 负责人类，负责管理备忘录对象
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class CareTaker {

    //只保存一次
    private EmpMemento memento;

    //保存很多次
    //private List<EmpMemento> list = new ArrayList<>();
    //private Stack<EmpMemento> stack = new Stack<>();//或者栈操作

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
