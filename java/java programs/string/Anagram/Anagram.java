package Anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
           char[] charArray1 = str1.toCharArray();
           char[] charArray2 = str2.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);
           boolean result = Arrays.equals(charArray1, charArray2);
           if(result){
            System.out.println("anagram");
           }else{
            System.out.println("not anagram");
           }
        }else{
            System.out.println(false);
        }
    }
}
