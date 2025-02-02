package week4.p5;

public class HeapSort {
    private int heapSize;
    private int[] items;

    public HeapSort() {
        heapSize = 0;
        items = new int[100];
    }

    public void insertHeap(int item) {
        int i = ++heapSize;

        while ((i != 1) && (item > items[i / 2])) {
            items[i] = items[i / 2];
            i /= 2;
        }
        items[i] = item;
    }

    public void printHeap() {
        System.out.print("Max Heap : ");
        for (int i = 1; i <= heapSize; i++) {
            System.out.printf("[%d] ", items[i]);
        }
    }

    public int getHeapSize() {
        return heapSize;
    }

    public int deleteHeap() {
        int parent, child;
        int item, temp;
        item = items[1];
        temp = items[heapSize--];
        parent = 1;
        child = 2;

        while (child <= heapSize) {
            if ((child < heapSize) && (items[child] < items[child + 1])) {
                child++;
            }
            if (temp >= items[child]) {
                break;
            }
            items[parent] = items[child];
            parent = child;
            child *= 2;
        }
        items[parent] = temp;
        return item;
    }
}
