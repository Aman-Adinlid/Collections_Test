package se.lexicon;

import se.lexicon.model.Person;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.size());
        for (Integer num : numbers) {
            System.out.println(num);
        }

        TreeSet<String> names = new TreeSet<>();
        names.add("Vanessa");
        names.add("Albin");
        System.out.println(names.toString());


        System.out.println("_______________________");

        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(12,"Aman","123pinpan@gmail.com",22));
        personSet.add(new Person(123,"Anna","12tratra@gmail.com",23));
        for (Person person: personSet){
            System.out.println(person.toString());

        }
    }
}
