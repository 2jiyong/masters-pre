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

    public void heapify(int index){
        int largest = index;
        int left = index * 2;
        int right = index * 2 + 1;

        if (left <= heapSize && items[left] > items[largest]) {
            largest = left;
        }

        if (right <= heapSize && items[right] > items[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = items[index];
            items[index] = items[largest];
            items[largest] = temp;
            heapify(largest);
        }
    }

    public int deleteHeap() {
        int value = items[1];
        items[1] = items[heapSize];
        heapSize--;
        heapify(1);
        return value;
    }
}
