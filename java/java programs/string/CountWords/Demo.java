//https://www.geeksforgeeks.org/count-words-in-a-given-string/
package CountWords;

public class Demo {
     int countWords(String str){

        if(str==null || str.isEmpty()){
            return 0;
        }else{
            String words[] = str.split("\\s+");
            return words.length;
        }

    }

    public static void main(String[] args) {
        String str = "pranav verma";
        Demo c = new Demo();
        System.out.println(c.countWords(str));


    }
}   
