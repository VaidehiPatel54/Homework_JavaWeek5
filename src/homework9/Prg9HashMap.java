package homework9;

import java.util.HashMap;

/* 9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
*/
public class Prg9HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values
        people.put("Vaidehi", 31);
        people.put("Gaurang", 34);
        people.put("Nidhi", 28);
        people.put("Kishan", 25);
        people.put("Foram", 33);
        people.put("Jyoti",35);
        people.put("Bhoomi",37);
        people.put("Vrajesh",36);
        people.put("Prime",39);


        //Print output using for each loop
        for (String i : people.keySet()) {
            System.out.println("String keys : " + i + ", Integer value : " + people.get(i));
        }
    }
}