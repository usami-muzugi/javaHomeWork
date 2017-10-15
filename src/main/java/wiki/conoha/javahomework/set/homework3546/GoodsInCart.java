package wiki.conoha.javahomework.set.homework3546;

public class GoodsInCart {
    private Goods goods; //商品
    private int num;  //数量

    public GoodsInCart(Goods goods, int num) {
        this.goods = goods;
        this.num = num;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public GoodsInCart() {

        this.goods = goods;
        this.num = num;
    }

    @Override
    public String toString() {
        return "商品名称:" +
                goods.getGoodsName() +
                "，商品价格:" +
                goods.getPrice() +
                "，商品描述:" +
                goods.getGoodsDesp();
    }
}
