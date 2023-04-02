package javahomeworkweek9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseAnArrayIntValues {
    public static void main(String[] args) {


        List<Integer> mylist = new ArrayList<Integer>();
        //Adding elements to the end
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);
        mylist.add(60);
        System.out.println("Original List:" + mylist);
        //Reverse an array of integer values
        Collections.reverse(mylist);
        System.out.println("Modified List :" + mylist);
    }
}