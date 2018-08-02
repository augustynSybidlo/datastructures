package datastructures;

import java.util.Arrays;

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

    public void add(int element) {
        changeCapacity();
        array[lastIndex++] = element;

    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        validateIndex(index);
        if (index == lastIndex) {
            lastIndex--;
        } else if (index < lastIndex) {
            removeFrom(index);
            lastIndex--;
        }
    }

    private void changeCapacity() {
        if (lastIndex == (array.length-1)) {
            int newSize = array.length * 2;
            array = Arrays.copyOf(array, newSize);
        }
    }

    private void validateIndex(int i) throws ArrayIndexOutOfBoundsException {
        if (i > (lastIndex - 1) || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void removeFrom(int index) {
        for (int i = index; i < lastIndex; i++) {
            array[i] = array[i+1];
        }
    }

}
