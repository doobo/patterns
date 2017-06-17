package composite;

/**
 * 组合模式，树形结构处理，杀毒软件流程
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public interface Component {
    void operation();
}

//叶子组件
interface Leaf extends Component{

}

//容器组件
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
