package flyweight;
/**
 * 享元类
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color+
        "棋子位置："+c.getX()+","+c.getY());
    }
}
