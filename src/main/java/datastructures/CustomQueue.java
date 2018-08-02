package datastructures;

public class CustomQueue {

    private Node head;
    private Node tail;
    private int size;

    public CustomQueue() {
        this.size = 0;
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
