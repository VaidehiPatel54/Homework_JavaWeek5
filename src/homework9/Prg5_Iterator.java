package homework9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 5. Write a Java program to iterate through all elements in an array list using
Iterator.
*/
public class Prg5_Iterator {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Red");
        list.add("Green");
        list.add("Prime");
        list.add(21820);
        list.add(true);
        list.add(false);
        list.add("Vaidehi");
        list.add(10.25);
        list.add('P');


        //Print output using Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());           // Print the list
        }
    }
}