package mci.se1.ex5.nr2.strategy;

public class InsertionSort implements SortingAlgorithm{
    private int[] unsortedArray;
    public InsertionSort(int[] unsortedArray){
        this.unsortedArray = unsortedArray;
    }
    @Override
    public int[] algorithm() {
        System.out.println("Executing Insertion sort");
        int n = unsortedArray.length;
        for (int i = 1; i < n; ++i) {
            int key = unsortedArray[i];
            int j = i - 1;

            while (j >= 0 && unsortedArray[j] > key) {
                unsortedArray[j + 1] = unsortedArray[j];
                j = j - 1;
            }
            unsortedArray[j + 1] = key;
        }
        return unsortedArray;
    }
}
