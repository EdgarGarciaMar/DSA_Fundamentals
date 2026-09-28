package Arrays;

import java.util.ArrayList;

public class arrays {

    private static void print(int [] arr){
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    /*In Java, an array is used to store a list of elements of the same datatype.
    Arrays are fixed in size and their elements are ordered. */
    private static void arr (){
        System.out.println("Bassic arrays in java");
        // Creation of arrays
        /*
        Using the {} notation, by adding each element all at once.
        */
        int[] age = {20, 21, 30};
        /*
        Using the new keyword, and assigning each position of the array individually.
        */
        int[] marks = new int[3];
        marks[0] = 50; 
        marks[1] = 70;
        marks[2] = 93;

        System.out.println("Creation");
        print(age);
        print(marks);

        // Updating element
        age[2] = 100;
        System.out.println("Age update");
        print(age);

    }

    //In Java, an ArrayList is used to represent a dynamic list.
    private static void arrayList(){
        // create an ArrayList called studentList, which initially holds []
		ArrayList<String> studentList = new ArrayList<String>();
    
        // add students to the ArrayList
        studentList.add("John");
        studentList.add("Lily");
        studentList.add("Samantha");
        studentList.add("Tony");
        
        // remove John from the ArrayList, then Lily
        studentList.remove(0);
        studentList.remove("Lily");
        System.out.println("Dinamic array list");
        System.out.println(studentList.get(0));
        //System.out.println(studentList); //print without iteration

        /*
        Core methods:
        Add to end---- list.add(5)
        Add at index---- list.add(2, 5)
        Get----	list.get(2)	
        Set/update----	list.set(2, 10)	
        Remove by index----	list.remove(2)	
        Remove by value----	list.remove(Integer.valueOf(5))	
        Search----	list.contains(5)	
        Find index----	list.indexOf(5)	
        Size----	list.size()	
        Empty?----	list.isEmpty()
        */
        System.out.println("Iterative print:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public static void main(String[] args) {
        arr();
        arrayList();
    }
    
}
