package Streamapi;

import java.util.HashSet;

public class Code {
    public static void main(String[]args){
        int X[]={1,2,3,4,6,5,8,7};
        HashSet<Integer>set=new HashSet<>();
        for(Integer Y:X){
            set.add(Y);

        }
        System.out.println(set);
    }


}
