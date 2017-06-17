package bridge;

/**
 * 品牌维度
 * Created by doobo@foxmail.com on 2017/6/4.
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.print("销售联想电脑");
    }
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.print("销售戴尔电脑");
    }
}

class Sz implements Brand{
    @Override
    public void sale() {
        System.out.print("销售深圳电脑");
    }
}
