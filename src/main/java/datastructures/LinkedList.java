package datastructures;

public class LinkedList<T> {

    private Node head;
    private int length;

    public LinkedList() {
        this.length = 0;
    }

    private void incrementLength() {
        this.length++;
    }

    private void decrementLength() {
        this.length--;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
            incrementLength();
        }
    }
}
