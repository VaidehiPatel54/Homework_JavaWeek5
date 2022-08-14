package homework9;
/* 4.Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop */

import java.util.ArrayList;
import java.util.List;

public class Prg4_ColourArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Yellow");

        //Print output using for each loop
       for (String value : list)
        {
            System.out.println(value);
        }
    }
}