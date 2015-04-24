package exercise0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 * <p/>
 * Exercise 0: Iterate over the keys of a Map using keySet method (this method returns a Set of all the map keys) and
 * print all its elements.
 */
public class Exercise0 {

    public Exercise0() {

    }

    public void iterateThroughMap() {

        // TODO Exercise #0 a) Create a Map (HashMap) and add elements to it (using put() method)
        // TODO Exercise #0 a) Hint: Don't forget to specify the types of the key and value when creating the Map
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "hei");
        hashmap.put(2, "iri");
        hashmap.put(3, "nice");

        // TODO Exercise #0 b) Iterate over the Map using keySet() method and print all its elements
        // TODO Exercise #0 b) The elements could be printed like this: [key1=value1, key2=value2, ...]

        System.out.print("[");
        Set keys = hashmap.keySet();
        int numar = 0;
        for (Integer cheie : hashmap.keySet()) {
            numar++;
            String value = hashmap.get(cheie);
            System.out.print(cheie + "" + "=" + value);
            if (!(numar == keys.size())) System.out.print(",");

        }

        System.out.print("]");
    }

    public static void main(String[] args) {
        Exercise0 exercise0 = new Exercise0();
        exercise0.iterateThroughMap();
    }
}
