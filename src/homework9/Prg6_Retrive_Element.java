package homework9;

import java.util.ArrayList;
import java.util.List;

/* 6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Prg6_Retrive_Element {
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


        // Retrive elements directly using index number
        System.out.println(list.get(4));
        System.out.println(list.get(3));
        //Retrive elements to creating object and call index number using object name
        Object element ;
        element = list.get(0);
        System.out.println("First element: "+element);
        element = list.get(6);
        System.out.println("Seventh element: "+element);
    }
}
