package Task19;

import java.util.Arrays;

public class Container {

    private int[] arr = new int[]{0};

    public Container() {
    }

    public Container(int element) {
        int length = 1;
        this.arr = new int[length];
        arr[0] = element;
    }

    public Container(int[] arr) {
        this.arr = arr;
    }

    public Container(Container c) {
        this.arr = c.arr;
    }

    public void add(int element) {
        if (arr[0] == 0 && arr.length == 1) {
            arr[0] = element;
        } else {
            int[] arr1 = new int[(arr.length + 1)];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];

            }
            arr1[arr.length] = element;
            arr = arr1;
        }
    }


    public int getByIndex(int index) {
        int element;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                element = arr[i];
            }
        }
        return element = -1;
    }

    public boolean contains(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public void addAll(Container external) {
        int l = this.arr.length + external.arr.length;
        int[] arr1 = new int[l];
        for (int i = 0; i < l; i++) {
            if (i < this.arr.length) {
                arr1[i] = arr[i];
            } else {
                arr1[i] = external.arr[i - external.arr.length];
            }
        }
        arr = arr1;
    }

    public boolean equals(Container c) {
        return Arrays.equals(arr, c.arr);
    }

    public void clear() {
        int[] arr1 = new int[]{0};
        arr = arr1;
    }

    public int indexOf(int element) {
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (contains(element) && arr[i] == element) {
                return index = i;
            }
        }
        System.out.print("There is no such element ");
        return index = -1;
    }

    public int getSize() {
        int size = arr.length;
        return size;
    }

    public void sort() {
        Arrays.sort(arr);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

