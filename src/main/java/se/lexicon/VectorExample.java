package se.lexicon;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1(){

        Vector <String> sms = new Vector<>();
        sms.add("hi1");
        sms.add("H r U?2");
        sms.add("Cool3");
        System.out.println(sms.size());
        sms.addElement("Hello4");
        System.out.println(sms.toString());
    }
}
