package composite;

/**
 * Created by doobo@foxmail.com on 2017/6/6.
 */
public class Client {
    public static void main(String[] args) {
        Folder f1 = new Folder("我的收藏");
        AbstractFile f2,f3;
        f2 = new ImageFile("我的头像");
        f3 = new TextFile("Hello.txt");
        f1.add(f2);
        f1.add(f3);

        Folder f4 = new Folder("图片收藏夹");
        f4.add(f2);

        f1.add(f4);
        f1.killVirus();
    }
}
