package FindDuplicateCharacter;

public class Demo {
    public static void main(String[] args) {
        String str = "beautiful beach";
        char[] carray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }

    }

}
