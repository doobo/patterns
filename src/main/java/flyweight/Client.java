package flyweight;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory
                .getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,10));
    }
}
