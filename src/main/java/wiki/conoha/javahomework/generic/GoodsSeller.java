package wiki.conoha.javahomework.generic;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goods){
        for (Goods g:goods
             ) {
            g.sell();
        }
    }
}
