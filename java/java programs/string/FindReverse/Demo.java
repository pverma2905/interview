// https://www.javatpoint.com/how-to-reverse-string-in-java
package FindReverse;
class Demo {

    public String reveseString(String str){
        StringBuilder s = new StringBuilder(str);
       s.reverse();
       return s.toString();
    }
   public static void main(String[] args) {
    Demo d = new Demo();
    System.out.println(d.reveseString("pranav verma"));
   }
}
