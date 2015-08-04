
package week7homework4;

import java.util.*;
public class Week7Homework4 {


    public static void main(String[] args) {
        //Create first hashset.
        Set<String> hashset1 = new HashSet<String>();
        
        //Add Strings to hashset1.
        hashset1.add("Jim");
        hashset1.add("Blake");
        hashset1.add("John");
        hashset1.add("Kevin");
        hashset1.add("Michael");
        hashset1.add("George");
        
        //Create second hashset.
        Set<String> hashset2 = new HashSet<String>();
        
        //Add Strings to hashset2.
        hashset2.add("Katie");
        hashset2.add("Michael");
        hashset2.add("George");
        hashset2.add("Ryan");
        hashset2.add("Kevin");
        
        //Heading.
        System.out.println("Benjamin Knauth = Teacher's Copy");
        
        //Print hash sets.
        System.out.print("\nHash Set 1 = " + hashset1);
        System.out.print("\nHash Set 2 = " + hashset2);
        
        //Union of two hash sets.
        hashset1.addAll(hashset2);
        System.out.println("\n\nUnion = " + hashset1);
        
        //Difference of two hash sets.
        hashset1.removeAll(hashset2);
        System.out.println("Difference (Set 1 - Set 2) = " + hashset1);
        
        //Intersection of two hash sets.
        hashset1.add("Kevin");
        hashset1.add("Michael");
        hashset1.add("George");
        hashset1.retainAll(hashset2);
        System.out.println("Intersection = " + hashset1);
    }
}
