package se.lexicon;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        ex1();

    }
    public static void ex1(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Zain");
        linkedList.add("Ed2");
        linkedList.add("Sheeran3");
        System.out.println(linkedList.size());
        linkedList.addFirst("Sarah");
        linkedList.addLast("Ross");
        System.out.println(linkedList.toString());


    }


}
