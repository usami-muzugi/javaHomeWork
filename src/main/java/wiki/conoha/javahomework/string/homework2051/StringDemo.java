package wiki.conoha.javahomework.string.homework2051;

public class StringDemo {

    public static void main(String[] args) {
        //定义字符串"abc"
        String string = new String("abc");
        //经过处理得到字符串"fed---cba"
        String[] strings = string.split("");
        try {
            if (strings.length != 0) {
                    for(int i = 0;i<strings.length/2;i++){
                        String temp;
                        temp = strings[i];
                        strings[i] = strings[strings.length-i-1];
                        strings[strings.length-i-1] = temp;
                    }
            }else{
                throw new Exception("ArrayIsNull");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s:strings
             ) {
            stringBuilder.append(s);
        }
        stringBuilder.insert(0,"fed---");
        //进一步变换得到字符串"fedcba"
        stringBuilder.delete(3,6);
        System.out.println(stringBuilder);

    }
}
