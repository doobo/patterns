package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * Created by doobo@foxmail.com on 2017/6/7.
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public void addObject(Object obj){
        list.add(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator(){
        return new ConCreteIterator();
    }

    private class ConCreteIterator implements MyIterator{

        private int cursor = 0;//定义游标，用于记录遍历时的位置，默认0

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor<list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor<list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size()-1);
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
