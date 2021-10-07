package lesson4;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;
    public void add(int value) {
        //if first add
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while(temp != null) {
            if(currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        // 1 - 2 - 3

        throw new IllegalArgumentException();
    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;
        while(temp != null) {
            result[index] = temp.getValue();
            index++;
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
