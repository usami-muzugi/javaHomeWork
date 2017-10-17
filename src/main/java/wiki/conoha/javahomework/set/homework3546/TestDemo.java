package wiki.conoha.javahomework.set.homework3546;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TestDemo {

    /**
     * call funcUI
     */
    public static void funcUI(){
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            int operation = -1;
            System.out.println("**************************************");
            System.out.println("             **主菜单**               ");
            System.out.println("             1--商品管理              ");
            System.out.println("             2--购物车                ");
            System.out.println("             0--退出                  ");
            System.out.println("**************************************");
            System.out.println();
            System.out.println("请输入对应的数字进行操作:");
            try {
                operation = scanner.nextInt();
                if (operation < 0 || operation > 2) System.out.println("请输入对应的数字进行操作！！！");
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("请输入数字进行操作！！！");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                switch (operation) {
                    case 0:
                        System.exit(0);
                    case 1:
                        funcGoods();
                        break;
                    case 2:
                        funcShop();
                        break;
                }
            }
        }
    }  //end funcUI();

    /**
     * call funcGoods
     */
    public static void funcGoods(){
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            int operation = -1;
            System.out.println("**************************************");
            System.out.println("             **商品管理**             ");
            System.out.println("             1--商品信息导入          ");
            System.out.println("             2--显示所有商品信息      ");
            System.out.println("             9--返回上一级菜单        ");
            System.out.println("**************************************");
            System.out.println();
            System.out.println("请输入对应的数字进行操作:");
            try {
                operation = scanner.nextInt();
                if (operation == 1 | operation == 2 | operation == 9) {

                    switch (operation) {
                        case 9:
                            funcUI();
                            break;
                        case 1:
                            System.out.println("商品信息导入中");
                            GoodsManage.importGoods();
                            System.out.println("导入成功！");
                            break;
                        case 2:
                            try {
                                System.out.println("显示所有商品信息");
                                System.out.println("所有商品信息为:");
                                GoodsManage.displayAllGoods();
                                break;
                            } catch (NullPointerException e) {
                                System.out.println("请先导入商品信息后再显示所有商品信息！！！");
                            }
                    }
                } else System.out.println("请输入对应的数字进行操作！！！");
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("请输入数字进行操作！！！");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }  //end funcGoods();

    /**
     *  call funShop()
     */
    public static void funcShop(){
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            int operation = -1;
            System.out.println("**************************************");
            System.out.println("             **购物车管理**           ");
            System.out.println("             1--添加商品到购物车      ");
            System.out.println("             2--修改购物车中的商品数量");
            System.out.println("             3--显示购物车中的所有商品");
            System.out.println("             4--结算                  ");
            System.out.println("             9--返回上一级菜单        ");
            System.out.println("**************************************");
            System.out.println();
            System.out.println("请输入对应的数字进行操作:");
            try {
                operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        funcGoodsAdd();
                        break;
                    case 2:
                        ShoppingCart.updateNumInCart();
                        break;
                    case 3:
                        ShoppingCart.displayAllInCart();
                        break;
                    case 4:
                        ShoppingCart.settleAccounts();
                        break;
                    case 9:
                        funcUI();
                        break;
                    default:
                        System.out.println("请输入对应的数字进行操作！！！");
                }
            } catch (InputMismatchException e) {
                System.out.println("请输入数字进行操作！！！");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }  //end funcShop();


    public static void funcGoodsAdd() {
        System.out.println("添加商品到购物车");
        System.out.println("所有商品信息为:");
        GoodsManage.importGoods();
        GoodsManage.displayAllGoods();
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
            if (ShoppingCart.getMap().containsKey(string)) {  //判断输入的商品是否已存在于购物车
                System.out.println("该商品已添加,要修改请使用 2--修改购物车中的商品数量");
            } else {
                System.out.println("请输入要添加的商品数量:");
                int sum = 0;
                try {
                    sum = scanner.nextInt();
                    while (sum <= 0) {
                        System.out.println("请输入大于0的数！！！");
                        System.out.println("请输入要添加的商品数量:");
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
                    if (goods.getGoodsId().equals(string)) {
                        ShoppingCart.addGoodsToCart(new GoodsInCart(goods,sum));
                    }
                }
            }
        }else{
            System.out.println("输入的商品不存在！！！请重新输入！！！");
        }
    }

    public static void main(String[] args) {
        funcUI();
    }
}
