package datastructures;

public class CustomQueue {

    private Node head;
    private Node tail;
    private int size;

    public CustomQueue() {
        this.size = 0;
    }

    public void enqueue (String value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            tail.nextNode = new Node(value);
            tail = tail.nextNode;
        }
        incrementSize();
    }

    public String dequeue() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Queue is Empty");

        String result = head.value;
        head = head.nextNode;
        decrementSize();
        return result;
    }

    public String peek() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException("Queue is Empty");
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }




    private void incrementSize() {
        size++;
    }

    private void decrementSize() {
        size--;
    }

    /*
    Inner class Node holds actual data kept in queue.
    It also contains field which points to next Node in
    queue.
     */
    private class Node {
        private String value;
        private Node nextNode;

        private Node(String value){
            this.value = value;
            this.nextNode = null;
        }
    }

}
