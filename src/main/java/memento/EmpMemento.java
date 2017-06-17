package memento;

/**
 * Created by doobo@foxmail.com on 2017/6/17.
 */
public class EmpMemento {
    private String e_name;

    private int age;

    private double salary;

    public EmpMemento(Emp e){
        this.e_name = e.getE_name();
        this.age = e.getAge();
        this.salary = e.getSalary();
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
