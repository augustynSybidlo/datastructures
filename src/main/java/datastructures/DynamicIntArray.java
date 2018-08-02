package datastructures;

public class DynamicIntArray {

    private int[] array;
    private int lastIndex = 0;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicIntArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    public DynamicIntArray(int i) {
        this.array = new int[i];
    }

}
