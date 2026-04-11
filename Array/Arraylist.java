package DSA.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        // initializing the Array List

        ArrayList<Integer> arr = new ArrayList<>();

        // declearing the arraylist

        arr.add(23);
        arr.add(12);
        arr.add(76);
        arr.add(55);
        arr.add(90);
        arr.add(123);
        arr.add(10);

        //print the perticular value

        System.out.println(arr.get(2));

        //Updating the arraylist

        arr.set(2, 1);

        //print the entire array

        System.out.println(arr);

        //Reverse the arraylist
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
