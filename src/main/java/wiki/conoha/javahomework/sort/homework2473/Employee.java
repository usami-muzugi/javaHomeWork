package wiki.conoha.javahomework.sort.homework2473;


/**
 * 定义一个员工信息类，
 * 包括编号，姓名，工资三个成员变量，要求工资定义为float类型，
 * 然后按工资进行降序排序。(使用Comparable接口)
 */
//实现Comparable接口
public class Employee implements Comparable<Employee>{
    public int compareTo(Employee o) {
        double m1 = this.getMoney();
        double m2 = o.getMoney();
        return new Double(m2 -m1).intValue();
    }
    //成员变量
    private String num;
    private String name;
    private double money;

    //构造方法

    public Employee(String num, String name, double money) {
        this.num = num;
        this.name = name;
        this.money = money;
    }


    //getter和setter方法

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    //toString()方法

    @Override
    public String toString() {
        return "Employee{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}