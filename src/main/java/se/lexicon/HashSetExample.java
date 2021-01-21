package se.lexicon;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Aman");
        names.add("Sam");
        names.add("Smith");
        System.out.println(names.size());

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
