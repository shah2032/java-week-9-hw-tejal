package javahomeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_IterateElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        //adding elements to the end
        arr1.add("First");
        arr1.add("Second");
        arr1.add("Third");
        arr1.add("Random");
        //Iterate alla elements in an array list using Iterator
        Iterator<String> itr =  arr1.iterator();
        while (itr.hasNext());
        System.out.println(itr.next());
    }

}
