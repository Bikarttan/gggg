package Streamapi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[]args){

        ArrayList<Menu> arraylist=new ArrayList<>();
        arraylist.add(new Menu("rajesh",77,"veg"));
        arraylist.add(new Menu("raju",78,"Nonveg"));
        arraylist.add(new Menu("sanju",79,"Nonveg"));
        arraylist.add(new Menu("artai",70,"veg"));

        Menu maxCaloriesMenu = arraylist.stream().max(Comparator.comparingInt(Menu::getCalories)).orElse(null);
        if(maxCaloriesMenu!=null){
            System.out.println("max Calories are"+maxCaloriesMenu);
        }
        else{
            System.out.println("calories not found");
        }

    }
}
