package Streamapi;

public class practice {
    public static void main(String[] args) {
        String name="Bikarttan is a good boy";
        String []rev=name.split(" ");
       String reverseString="";
       for(String w:rev){
           String Revword ="";
           for(int i=w.length()-1;i>=0;i--){
                Revword=Revword+w.charAt(i);
           }
           reverseString=reverseString+Revword+" ";
       }
       System.out.println(reverseString);
    }
}
