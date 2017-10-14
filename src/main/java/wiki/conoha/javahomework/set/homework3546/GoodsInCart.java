package wiki.conoha.javahomework.set.homework3546;

public class GoodsInCart {
    private Goods goods;

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

    public GoodsInCart(Goods goods, int num) {

        this.goods = goods;
        this.num = num;
    }

    private int num;

}
