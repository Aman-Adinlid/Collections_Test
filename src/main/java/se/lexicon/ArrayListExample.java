package se.lexicon;

import se.lexicon.model.Person;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {


       exc3();
       exc4();
       exc5();
       ex6();
    }

    public static void exc1() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        System.out.println("Array size: " + numbers.size());
        System.out.println("Array Information: " + numbers.toString());

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            // System.out.println("Numbers: " + iterator.next());
            int num = iterator.next();
            System.out.println("Number: " + num);
            if (num == 300) {
                iterator.remove();

            }

        }


    }
    public static void exc2(){

        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Adam");
        names.add("Sanna");
        System.out.println("Array Information " + names.toString());
        System.out.println("names: " + names.get(1));
        names.remove(2);
        System.out.println("size: " + names.size());
        names.remove("Aman");
        System.out.println("size: " + names.size());
    }
    public static void exc3(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(1);
        numbers.add(2);
        numbers.add(200);
        numbers.remove(0);
        System.out.println("numbers: " + numbers) ;
        System.out.println("size: " + numbers.size());
        numbers.add(100);
        System.out.println("size: " + numbers.size());

    }
    public static void exc4(){
         ArrayList<String> names = new ArrayList<>();
         names.add("Rose");
         names.add("Ross");
         names.remove(0);
        System.out.println("size: " + names.size());
        names.remove("Ross");
        System.out.println("size:" + names.size());
        Object []nameArray =  names.toArray();
        System.out.println("Array length: " + nameArray.length);


    }

    public static void exc5(){

        List<Person> personList = new ArrayList<>();
        Person Aman = new Person(128,"Aman","pinkpanda@gmail.com",24);
        personList.add(Aman);
        Person Adam = new Person();
        Adam.setName("Anna");
        Adam.setAge(32);
        Adam.setId(234);
        Adam.setEmail("123hope@gmail.com");
        System.out.println("Person List: " + personList.size());
        personList.add(new Person(4,"Test","23test@gmail.com",33));

        for (Person person: personList){
            if (person.getId()==128){
                System.out.println(person.toString());
                break;
            }

        }


    }

    public static void ex6(){

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        System.out.println(numbers.toString());
        Collections.sort(numbers);
        System.out.println(numbers.toString());
    }
}
