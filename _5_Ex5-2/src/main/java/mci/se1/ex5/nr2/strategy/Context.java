package mci.se1.ex5.nr2.strategy;

public class Context {
    private SortingAlgorithm sortingAlgorithm;
    public Context(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int[] executeSorting(){
        int[] sortedArray = sortingAlgorithm.algorithm();
        printArray(sortedArray);
        return sortedArray;
    }

    public void printArray(int[] array){
        if(array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("array is empty");
        }
    }
}
