package wiki.conoha.javahomework.classhomework;


/**
 * 匿名内部类相对与有具体实例对象来说更适合用于仅仅引用一次的情况，
 * 但是弊端是由于没有具体实例和命名所以需要做上代码注释为妙
 */
public class PersonTest {
    //更具传入的...调用read方法;


//    /**
//     * 方案一
//     */
//    public void getRead(Man man){
//        man.read();
//    }
//
//
//    public void getRead(Woman woman){
//        woman.read();
//    }

    /**
     * 方案二
     */
    public void getRead(Person person){
        person.read();
    }



    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
//        Man man = new Man();
//        Woman woman = new Woman();
//        personTest.getRead(man);
//        personTest.getRead(woman);


        /**
         * 匿名内部类
         */
        personTest.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("男人喜欢读科幻书");
            }
        });

        personTest.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢看言情小说");
            }
        });

    }
}
