package dataStructure;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.LinkedList<>();
        list.add("Lahore");
        list.add("Islamabad");
        list.add("Peshawar");
        list.add("Karachi");
        //System.out.println(list.isEmpty());
        //System.out.println(list.contains("Karachi"));

        /*Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        for (String st: list) {
            System.out.println(st);
        }
    }
}
