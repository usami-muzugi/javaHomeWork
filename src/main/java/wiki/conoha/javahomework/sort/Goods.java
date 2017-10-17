package wiki.conoha.javahomework.sort;

public class Goods implements Comparable<Goods>{

    public int compareTo(Goods o) {
        //取出商品价格
        //当前对象和方法参数中的对象
        double price1 = this.getPrice();
        double price2 =  o.getPrice();
        return new Double(price2-price1).intValue();
    }

        private String id; //商品编号
        private String name; //商品名称
        private double price; //商品价格



        public Goods(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }  //end Goods()

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        /**
         *
         * @return Goods
         */
        @Override
        public String toString() {
            return "商品编号:'" + id + '\'' +
                    ", 商品名称'" + name + '\'' +
                    ", 商品价格:" + price;
        }
}
