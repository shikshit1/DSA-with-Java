package JavaFrameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    static void main(String[] args) {


        Map<String, String> mapping = new HashMap<>();


        //Insertion
        mapping.put("in", "India");
        mapping.put("en", "england");
        System.out.println(mapping);
    }
}
