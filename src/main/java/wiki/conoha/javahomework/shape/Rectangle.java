package wiki.conoha.javahomework.shape;



public class Rectangle extends Shape {
    /**
     * 属性：矩形的长lenghth、宽wide
     */

    private double length;
    private  double wide;


    /**
     * 创建带参构造方法以及无参构造方法
     *
     */
    public Rectangle(){}

    @Override
    public Object area() {
        return length*wide;
    }


    public Rectangle(double length,double wide){
        setLength(length);
        setWide(wide);
    };

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
}
