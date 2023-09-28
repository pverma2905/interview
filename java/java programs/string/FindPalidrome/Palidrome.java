//https://www.programiz.com/java-programming/examples/palindrome-number
package FindPalidrome;

public class Palidrome {
    String CheckPalidrome(String str){
       String reverseStr="";
      
     for(int i=str.length()-1; i>=0; i--){
        reverseStr = reverseStr + str.charAt(i);
     }

     if(str.toLowerCase().equals(reverseStr.toLowerCase())){
        return str + " is a Palindrome String.";
     }else{
       return str + " is not a Palindrome String.";
     }
    }

    public static void main(String[] args) {
        Palidrome p = new Palidrome();
        String str = "radar";
        System.out.println(p.CheckPalidrome(str));
        
    }
}
