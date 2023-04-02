package javahomeworkweek9;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_CompareTwoArrayList {
    public static void main(String[] args) {
        //Declare arrayList c1
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First List :" + c1);
     //Declare arrayList c2
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second List :"  + c2);
        //Compare both c1 list and c2 list
        c1.retainAll(c2);
        System.out.println("\n The common elements from two list are :"  + c1);

    }
}