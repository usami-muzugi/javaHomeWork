package wiki.conoha.javahomework.homework2120;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 09:39
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class ObjectDemo implements Serializable{
    private int id;
    private String name;
    private String type;
    private double price;

    public ObjectDemo(int id,String name,String type,double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple系列产品信息:\n" +
                "产品ID:" + id +
                "\n产品名称:" + name +
                "\n产品属性:" + type +
                "\n产品价格" + price+
                "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
