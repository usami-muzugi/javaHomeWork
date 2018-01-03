package wiki.conoha.javahomework.IO;


import wiki.conoha.javahomework.homework2116.FileOperat;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 16:22
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

/**
 *  JAVA 对象序列化和反序列化
 *  JAVA 对象序列化就是把JAVA对象转换为字节序列的过程
 *  JAVA 对象反序列化就是把字节序列转换为JAVA对象的过程。
 *  整个过程可逆，但是对象的读取，其顺序不可颠倒、更替等。
 *  否者报EOFException异常。↓
 *  java.io.EOFException
 at java.io.ObjectInputStream$BlockDataInputStream.readBoolean(ObjectInputStream.java:3077)
 at java.io.ObjectInputStream.readBoolean(ObjectInputStream.java:957)
 at wiki.conoha.javahomework.IO.Test.main(ObjctStreamTest.java:92)
 */

public class ObjctStreamTest implements Serializable{
    private String goodsId;
    private String goodsName;
    private double goodsPrice;

    public ObjctStreamTest(String goodsId,String goodsName,double goodsPrice) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        return "商品信息{" +
                "商品ID:'" + goodsId + '\'' +
                ", 商品名称:'" + goodsName + '\'' +
                ", 商品价格:" + goodsPrice +
                '}';
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}

class Test {
    public static void main(String[] args) {
        ObjctStreamTest objctStreamTest = new ObjctStreamTest("jd001","电脑",3000);
        try {
            System.out.println("写数据");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\ObjectStreamFile");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Thread.sleep(1000);
            System.out.println("写入一个对象");
            objectOutputStream.writeObject(objctStreamTest);  //写入一个对象
            Thread.sleep(1000);
            System.out.println("写入一个布尔类型的对象");
            objectOutputStream.writeBoolean(new Boolean(true)); //写入一个布尔类型的对象
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("写入完成！");
            Thread.sleep(1000);
            System.out.println("读数据");
            FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\ObjectStreamFile"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("读取一个对象");
            Thread.sleep(1000);
            //不能这样，必须按顺序来读取。否者会报EOF异常
//            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readObject());
            Thread.sleep(1000);
            System.out.println("读取一个布尔类型的对象");
            System.out.println(objectInputStream.readBoolean());
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
