package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Pakistan");
        queue.add("Afghanistan");
        queue.add("India");
        queue.add("England");

       /* Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String st: queue) {
            System.out.println(st);

        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/
        System.out.println(queue.poll());
    }
}
