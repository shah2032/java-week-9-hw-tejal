package javahomeworkweek9;

import java.util.ArrayList;
import java.util.List;

/**
 *6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {
        //Create a list and some colors to the list
        List<String> alist = new ArrayList<>();
        alist.add("James");
        alist.add("George");
        alist.add("Susan");
        alist.add("William");
        alist.add("John");
        //Retrieve an element (at a specified) from a given array list
        System.out.println("The element at  index 3 in the ArrayList is:"  + alist.get(3));
    }
}
