public class MergeSortMain03 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting03 msort = new MergeSorting03();
        System.out.println("Data awal");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        msort.printArray(data);
    }
}