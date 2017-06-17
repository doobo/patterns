package iterator;

/**
 * 自定义的迭代器接口
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();
}
