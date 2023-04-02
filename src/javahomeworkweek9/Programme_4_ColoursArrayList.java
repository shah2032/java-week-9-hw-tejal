package javahomeworkweek9;

import java.util.ArrayList;
import java.util.List;

/**4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {


        //Create a list and add some colour to the list
        List<String> colourlist = new ArrayList<String>();
        colourlist.add("Red");
        colourlist.add("Green");
        colourlist.add("Black");
        colourlist.add("Orange");
        colourlist.add("Blue");
        //Print the list
        for(String element : colourlist){
            System.out.println(element);
        }

    }

}
