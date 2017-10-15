package wiki.conoha.javahomework.set.homework3546;

import java.util.*;


public class ShoppingCart {
    private static Map<String,GoodsInCart> map = new HashMap<String, GoodsInCart>();

    public static Map<String, GoodsInCart> getMap() {
        return map;
    }

    public static void setMap(Map<String, GoodsInCart> map) {
        ShoppingCart.map = map;
    }

    public static void addGoodsToCart(GoodsInCart goodsInCart) {  //添加商品到购物车
        String string = goodsInCart.getGoods().getGoodsId();
        map.put(string,goodsInCart);
    }
    public static void updateNumInCart() {
        System.out.println("修改购物车中商品数量");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加的商品编号:");
        String string = scanner.next();
        Iterator<Goods> goodsManageIterator = GoodsManage.getSet().iterator();
        boolean flag = false;
        while (goodsManageIterator.hasNext()) {  //判断输入的商品编号是否存在
            if (goodsManageIterator.next().getGoodsId().equals(string)) {
                flag = true;
            }
        }
        if (flag) {
            if (ShoppingCart.getMap().containsKey(string)) {  //判断输入的商品是否已存在于购物车清单
                System.out.println("请输入新的的商品数量:");
                int sum = 0;
                try {
                    sum = scanner.nextInt();
                    while (sum < 0) {
                        System.out.println("请输入不小于0的数！！！");
                        System.out.println("请重新输入新的的商品数量:");
                        sum = scanner.nextInt();
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("请输入数字进行操作！！！");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                Iterator<Goods> iterator = GoodsManage.getSet().iterator();
                while (iterator.hasNext()) {
                    Goods goods = iterator.next();
                    if (sum == 0) {
                        ShoppingCart.getMap().remove(string);
                        System.out.println("删除成功！");
                        break;
                    } else {
                        if (goods.getGoodsId().equals(string)) {
                            ShoppingCart.addGoodsToCart(new GoodsInCart(goods, sum));
                            System.out.println("修改成功！");
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("购物车中并没有这个商品，请先添加");
        }
    }
    public static void displayAllInCart() {

        Iterator<GoodsInCart> iterator = ShoppingCart.getMap().values().iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            GoodsInCart goodsInCart = iterator.next();
            System.out.println(goodsInCart+", 数量:"+goodsInCart.getNum());
            flag = true;
        }
        if (!flag) {
            System.out.println("什么都没有！！！");
        }
    }
    public static void settleAccounts() {
        Iterator<GoodsInCart> iterator = ShoppingCart.getMap().values().iterator();
        boolean flag = false;
        int sum = 0;
        while (iterator.hasNext()) {
            GoodsInCart goodsInCart = iterator.next();
            sum+=goodsInCart.getGoods().getPrice()*goodsInCart.getNum();
            flag = true;
        }
        System.out.println("商品的总价为:"+sum);
        iterator = ShoppingCart.getMap().values().iterator();
        while (iterator.hasNext()) {
            GoodsInCart goodsInCart = iterator.next();
            System.out.println(goodsInCart+",数量:"+goodsInCart.getNum());
        }
        if (!flag) {
            System.out.println("什么都没有别结算！！！");
        }
    }
}
