//https://www.geeksforgeeks.org/java-program-to-count-number-of-vowels-in-a-string/
package CountVowel;

public class Demo {

    int countvowel(String str){
        str = str.toLowerCase();
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            // System.out.println("xxxxxx"+str.charAt(i));
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
               
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "pranav";
        Demo s = new Demo();
        System.out.println(s.countvowel(str));
    }
    
}
