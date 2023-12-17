public class Main {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        SortingAlgorithm selectionSort = new SelectionSort();
        SortingAlgorithm mergeSort = new MergeSort();
        SortingAlgorithm insertionSort = new InsertionSort();

        performSortAndPrint(selectionSort, arr);
        performSortAndPrint(mergeSort, arr);
        performSortAndPrint(insertionSort, arr);
    }

    private static void performSortAndPrint(SortingAlgorithm algorithm, int[] arr) {
        algorithm.sort(arr);
        // พิมพ์อาเรย์หลังจากการเรียงลำดับ
        System.out.print("Sorted array: ");
        printArray(arr);
        System.out.println();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
