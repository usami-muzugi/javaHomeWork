package wiki.conoha.javahomework.set.homework3546;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {

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
    }

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
                    GoodsManage goodsManage = GoodsManage.getInstance();
                    switch (operation) {
                        case 9:
                            funcUI();
                            break;
                        case 1:
                            System.out.println("商品信息导入中");
                            goodsManage.importGoods();
                            System.out.println("导入成功！");
                            break;
                        case 2:
                            try {
                                System.out.println("显示所有商品信息");
                                System.out.println("所有商品信息为:");
                                goodsManage.displayAllGoods();
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
    }

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
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
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
    }

    public static void main(String[] args) {
        funcUI();
    }

}
