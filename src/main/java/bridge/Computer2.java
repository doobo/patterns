package bridge;

/**
 * 未使用桥接模式
 * Created by doobo@foxmail.com on 2017/6/4.
 */
public interface Computer2 {
    void sale();
}

class Desktop implements Computer2 {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer2 {

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer2 {

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售联想平板电脑");
    }
}

class SzDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售神州台式机");
    }
}

class SzLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售神州笔记本");
    }
}

class SzPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售神州平板电脑");
    }
}

class DellDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}

class DellLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}

class DellPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售戴尔平板电脑");
    }
}