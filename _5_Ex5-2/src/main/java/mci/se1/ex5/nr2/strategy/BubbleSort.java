package mci.se1.ex5.nr2.strategy;

public class BubbleSort implements SortingAlgorithm{
    private int[] unsortedArray;

    public BubbleSort(int[] unsortedArray){
        this.unsortedArray = unsortedArray;
    }
    @Override
    public int[] algorithm() {
        System.out.println("Executing Bubble sort");
        int n = unsortedArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (unsortedArray[j] > unsortedArray[j+1]) {
                    // Tausche arr[j] und arr[j+1]
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
