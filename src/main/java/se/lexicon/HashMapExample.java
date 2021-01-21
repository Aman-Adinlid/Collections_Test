package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Aman");
        hashMap.put(2,"Alfa");
        System.out.println(hashMap.size());
        for (Map.Entry m : hashMap.entrySet()){
            System.out.println("key: "+ m.getKey() + "\t" +"Value: "+ m.getValue());
            System.out.println(hashMap.get(1));
            System.out.println(hashMap.keySet());
        }
    }
}
