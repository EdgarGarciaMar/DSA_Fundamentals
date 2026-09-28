package HashMap;

import java.util.HashMap;

/*
Definition:
HashMap is a part of the Java Collections Framework.
It implements the Map interface and stores data in key-value pairs.
2. Key Features:

It allows null values and a single null key.
It does not guarantee the order of elements.
3. Key and Value:

Each key in a HashMap must be unique.
Values can be duplicated.
 */

public class hashmap {
    private static void map(){
        HashMap<String, Integer> mapa = new HashMap<>();

        //Inserts a key-value pair into the HashMap.
        mapa.put("a", 1);
        mapa.put("b", 2);
        mapa.put("c", 3);
        mapa.put("d", 4);

        //Retrieves the value associated with the specified key.
        System.out.println(mapa.get("d"));
        // Removes the key and its associated value.
        mapa.remove("d");


        //Print the map
        System.out.println(mapa);
        //Iterate across the map
        System.out.println("Iterating accross the map");
        for (var entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Keys only:");
        for (String key : mapa.keySet()) {
            System.out.println(key);
        }
        System.out.println("Values only:");
        for (int value : mapa.values()) {
            System.out.println(value);
        }

        // Checks if the HashMap contains a specific key.
        System.out.println("Contains key a: "+mapa.containsKey("a"));
        // Checks if the HashMap contains a specific value.
        System.out.println("Contains value 2: "+mapa.containsValue(2));
        // Returns the number of key-value pairs in the HashMap.
        System.out.println("Current size: "+ mapa.size());
    }

    public static void main(String[] args) {
        map();
    }
    
}
