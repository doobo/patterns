package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 查毒文件遍历--组合模式
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀图片文件");
    }
}

class TextFile implements AbstractFile{
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文本文件");
    }
}

class VideoFile implements AbstractFile{
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀视频文件");
    }
}

class Folder implements AbstractFile{
    private String name;
    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    void add(AbstractFile f){
        list.add(f);
    }

    void remove(AbstractFile f){
        list.remove(f);
    }

    AbstractFile getChild(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文件夹:"+name+"里面的文件");
        //天然的递归
        for (AbstractFile file : list){
            file.killVirus();
        }
    }
}