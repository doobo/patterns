package memento;

/**
 * 源发器类
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class Emp {
    private String e_name;

    private int age;

    private double salary;

    public Emp(String e_name, int age, double salary) {
        this.e_name = e_name;
        this.age = age;
        this.salary = salary;
    }

    //进行备忘操作，并返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    //进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmpMemento mmt){
        this.e_name = mmt.getE_name();
        this.age = mmt.getAge();
        this.salary = mmt.getSalary();
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
