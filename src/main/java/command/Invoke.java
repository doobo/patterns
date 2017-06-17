package command;

/**
 * 调用者、发起者
 * Created by doobo@foxmail.com on 2017/6/16.
 */
public class Invoke {
    //也可以通过容器List<Command>容纳很多的命令对象，进行批处理.
    // 数据库底层的事物管理就是类似的处理
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }
    //业务方法，用于调用命令类的方法
    public void call(){
        //在调用前或者后可以进行相应的处理
        command.execute();
    }
}
