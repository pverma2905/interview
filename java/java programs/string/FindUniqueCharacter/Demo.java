//https://www.geeksforgeeks.org/determine-string-unique-characters/
package FindUniqueCharacter;

public class Demo {
    boolean UniqueCharacter(String str){
      for(int i=0; i<str.length(); i++){
        for(int j=i+1; j<str.length(); j++){
            if(str.charAt(i)==str.charAt(j)){
                return false;
            }
           
        }
        
      }
      return true;
    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        String str = "pran";
        if(obj.UniqueCharacter(str)){
            System.out.println("string has unique character");
        }else{
            System.out.println("string has not unique character");
        }
    }
}
