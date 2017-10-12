package wiki.conoha.javahomework.shape;

public class Circle extends Shape{
    private double r;

    public void setR(double r) {
        this.r = r;
    }
    public Circle(){

    }

    public double getR() {
        return r;
    }

    public Circle(double r){
        setR(r);
    }

    @Override
    public Object area() {
        double dou = Math.PI*r*r;
        return dou;
    }
}
