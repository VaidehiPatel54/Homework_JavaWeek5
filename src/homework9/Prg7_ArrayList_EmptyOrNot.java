package homework9;

import java.util.ArrayList;
import java.util.List;

/* 7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class Prg7_ArrayList_EmptyOrNot {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Central Line");
        list.add("Victoria Line");
        list.add("Northen Line");
        list.add("Jubilee Line");
        list.add("Piccadilly Line");
        list.add("Hammersmith & City");
        list.add("Bakerloo Line");
        list.add("Waterloo & City");
        list.add("DLR");


        System.out.println("Original array list :  " +list );
        System.out.println("Checking the above array list is empty or not... "  +list.isEmpty());
        list.remove(5);
        System.out.println("Array list after remove element  : " +list);
        list.removeAll(list);
        System.out.println("Array list after remove all element  : " +list);
        System.out.println("Checking the above array list is empty or not... "  +list.isEmpty());
    }
}
