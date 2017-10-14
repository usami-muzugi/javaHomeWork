package wiki.conoha.javahomework.set.homework3546;

/**
 * Goods类，定义商品的编号、名称、价格、描述
 * 方法 构造方法、getter&&setter、hashseCode&equals、toStirng
 */
public class Goods {
    //成员属性
    private String goodsId;
    private String goodsName;
    private double price;
    private String goodsDesp;

    public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsDesp = goodsDesp;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    @Override
    public String toString() {
        return "商品信息[" +
                "编号:" + goodsId  +
                " 名称:" + goodsName  +
                " 价格:" + price +
                " 描述:" + goodsDesp  +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (Double.compare(goods.price, price) != 0) return false;
        if (goodsId != null ? !goodsId.equals(goods.goodsId) : goods.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(goods.goodsName) : goods.goodsName != null) return false;
        return goodsDesp != null ? goodsDesp.equals(goods.goodsDesp) : goods.goodsDesp == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = goodsId != null ? goodsId.hashCode() : 0;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (goodsDesp != null ? goodsDesp.hashCode() : 0);
        return result;
    }
}
