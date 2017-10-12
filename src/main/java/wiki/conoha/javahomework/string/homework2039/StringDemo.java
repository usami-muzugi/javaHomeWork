package wiki.conoha.javahomework.string.homework2039;

public class StringDemo {

    public static void main(String[] args) {
		/*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String string = "abcdefg";
        string = string.toUpperCase();
        string = string.replace("DE","MM");
        string = string.substring(2,5);
        System.out.println(string.toString());



    }
}