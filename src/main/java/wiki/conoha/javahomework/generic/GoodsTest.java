package wiki.conoha.javahomework.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        //定义Book相关的List
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());
        books.add(new Book());
        List<Clothes> clothes = new ArrayList<Clothes>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());
        List<Shoes> shoes = new ArrayList<Shoes>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());
        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(books);
    }
}
