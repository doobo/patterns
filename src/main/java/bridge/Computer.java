package bridge;

/**
 * 电脑类型维度
 * Created by doobo@foxmail.com on 2017/6/4.
 */
public class Computer{
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class Desktop2 extends Computer{
    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("\t台式机");
    }
}

class Laptop2 extends Computer{
    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("\t笔记本");
    }
}

class Pad2 extends Computer{
    public Pad2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("\t平板电脑");
    }
}