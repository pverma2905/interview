package RemoveWhiteSpace;

public class Demo {
    public static void main(String[] args) {
        String str = "pranav verma";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
