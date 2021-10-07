package lesson4;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(100);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.get(100));
    }
}
