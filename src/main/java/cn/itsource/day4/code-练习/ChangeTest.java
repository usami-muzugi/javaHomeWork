class BiaoDaShi {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("Before\n a=" + a + " b=" + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After\n a= " + a + " b= " + b);
    }
}
