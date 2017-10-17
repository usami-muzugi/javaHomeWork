package wiki.conoha.javahomework.sort.homework2472;

public class Student {
    //成员变量
    private int num;
    private int age;
    private String name;

    //构造方法

    public Student(int num, int age, String name) {
        this.num = num;
        this.age = age;
        this.name = name;
    }


    //getter和setter方法

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //toString()方法

    @Override
    public String toString() {
        return "[" +
                "学号:" + num +
                ", 年龄:" + age +
                ", 姓名:'" + name + '\'' +
                ']';
    }
}
