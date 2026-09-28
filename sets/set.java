package sets;

import java.util.HashSet;
import java.util.Set;

/*
Set interface is a part of the Java Collection Framework, located in the java.util package. 
It represents a collection of unique elements, meaning it does not allow duplicate values.
*/
public class set {
    
    private static void sets(){
        //creating the set
        Set<String> s = new HashSet<String>();

        //adding elements
        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");

        //Contains
        String letter = "D";
        System.out.println("Contains " + letter + ": " + s.contains(letter));
        //Print the set
        System.out.println(s);
        //Delete elements
        s.remove("B");
        System.out.println("After removing element " + s);
        //Iterating accross the elements
        System.out.println("Iterations:");
        for(String a : s){
            System.out.print(a+", ");
        }
        System.out.println();
        //Is empty
        System.out.println("Is empty: "+ s.isEmpty());
        //size
        System.out.println("Current size:"+ s.size());

        /**
         * toArray(): This method is used to form an array of the same elements as that of the Set.
         * addAll(collection): Adds all elements from the given collection.
         * containsAll(collection): Checks if the set contains all elements from the given collection.
         * hashCode(): Returns the hash code of the set.
         * iterator(): This method is used to return the iterator of the set.
         */
    }

    public static void main(String[] args) {
        sets();
    }
}
