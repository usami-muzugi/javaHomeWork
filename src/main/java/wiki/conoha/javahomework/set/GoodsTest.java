package wiki.conoha.javahomework.set;

import java.util.*;

public class GoodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Goods> map = new HashMap<String, Goods>();
        System.out.println("请输入三条商品信息");
        int i = 0;
        while (i<3) {
            System.out.println("请输入第"+(i+1)+"条商品的信息");
            System.out.println("请输入商品编号");
            String goodsId = scanner.next();
            if (map.containsKey(goodsId)) {
                System.out.println("该商品编号已经存在请重新输入");
                continue;
            }
            System.out.println("请输入商品名称");
            String goodsName = scanner.next();
            System.out.println("请输入商品价格");
            double goodsPrice = 0;
            //double goodsPrice = scanner.nextDouble();   //java.util.InputMismatchException
            try {
                goodsPrice = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("商品价格不是数值型，请重新输入");
                scanner.next();
                continue;
            }

            Goods goods = new Goods(goodsId,goodsName,goodsPrice);
            map.put(goodsId,goods);
            i++;
        }

        //遍历Map输出商品信息

        Iterator<Goods> iterator = map.values().iterator();
        while (iterator.hasNext()) { //如果迭代器中还有数据的话
            System.out.println(iterator.next());
        }


        /**
         * Key值相同只会录入一条Value，所以需要做一个判断来控制Key
         *
         *
         * 请输入三条商品信息
         请输入第1条商品的信息
         请输入商品编号
         1
         请输入商品名称
         2
         请输入商品价格
         3
         请输入第2条商品的信息
         请输入商品编号
         1
         请输入商品名称
         2
         请输入商品价格
         4
         请输入第3条商品的信息
         请输入商品编号
         1
         请输入商品名称
         3
         请输入商品价格
         4
         商品编号:'1', 商品名称'3', 商品价格:4.0

         Process finished with exit code 0

         */


    }
}
