package wiki.conoha.javahomework.phone;

public class TellPhone {
    private String  brand;
    private int price;
    public void call(){
        System.out.println("手机可以打电话");
    }

    public TellPhone(){};

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
