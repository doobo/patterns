package decorator;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("添加新的功能-飞");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("添加新的功能-水上游");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("添加组合新兴功能");
        AiCar aiCar = new AiCar(new WaterCar(new FlyCar(car)));
        aiCar.move();

    }
}
