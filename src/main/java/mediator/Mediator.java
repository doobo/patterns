package mediator;

/**
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public interface Mediator {
    void register(String name,Department d);

    void command(String name);
}
