package JavaFrameworks;

import java.util.*;

public class HashMapBasics {
    static void main(String[] args) {


        Map<String, String> mapping = new HashMap<>();


        //Insertion
        mapping.put("in", "India");
        mapping.put("en", "england");
        System.out.println(mapping);


        Map<String,String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("before:"+ table);
        table.putAll(mapping);
        System.out.println("after:"+ table);

        //deletion
//        table.remove("en");
        System.out.println(table);

        System.out.println(table.size());

        //putifAbsent
//        table.putIfAbsent("is", "India");   // agr koi key value present nhi hai toh usko add kr dega
        System.out.println(table);

        //get
        System.out.println(table.get("br"));    //return the value assoociated with the specified key k .if the key is not found , it returns null

        //getOrDefault        // Returns the value associated with the specified key k. if the key is not found, it returns the default value
        System.out.println(table.getOrDefault("in", "None"));

         //Contains key  //  check a key is present in your map or  not
           //return ture/false
        System.out.println(table.containsKey("br"));

         // contains Value   // for checking the  value
        // return true/false

        System.out.println(table.containsValue("brazil"));

        System.out.println(table);     //print table


        //Replace(K,V) //   replace the value of key k with the new specified value V.
        table.replace("in", "Indonesia");
        System.out.println(table);

        //Keyset()  //Return a set of all the keys present in a map

        Set<String> keyset = table.keySet();
        System.out.println(keyset);


        //Valueset()  // return the value of all the  value present in map

        Collection<String> valueSet =  table.values();
        System.out.println(valueSet);

        //get all the entries from map
        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        //entryset()   // returns all the key annd values
        System.out.println("Printing entries:"+entrySet);


//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"one");
//        map.put(2, "two");
//        for(Map.Entry<Integer,String> entry: map.entrySet()) {
//            System.out.println("key:" + entry.getKey()+", Value:" + entry.getValue());
//        }

    }
}
