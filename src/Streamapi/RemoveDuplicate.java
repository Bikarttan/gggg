package Streamapi;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] x = {1, 5, 2, 3, 2, 4, 4, 1, 6};
        Arrays.sort(x);
        Remove(x);
    }
     public static void Remove(int[] x){
         int []temp=new int[x.length];
         int j=0;
         for(int i=0;i<x.length-1;i++){
             if(x[i]!=x[i+1]){
                 temp[j]=x[i];
                 j++;
             }
         }
         temp[j]=x[x.length-1];
         for(int i=0;i<j;i++){
             System.out.println(temp[i]);
         }
         System.out.println(temp[j]);
     }
     }



