package decorator;
/**
 * 装饰模式，解决类继承的复杂扩容问题
 * 可以自由排列组合功能
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public interface ICar {
    void move();
}

//ConcreteComponent 具体构建角色（真实对象）
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地上跑……");
    }
}

//Decorator 装饰角色
class SuperCar implements ICar{
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//具体装饰对象ConcreteDecorator
class FlyCar extends SuperCar{
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

//具体装饰对象ConcreteDecorator
class WaterCar extends SuperCar{
    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

//具体装饰对象ConcreteDecorator
class AiCar extends SuperCar{
    public AiCar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
