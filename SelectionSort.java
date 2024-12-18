public class SelectionSort extends SortingAlgorithm {

    public SelectionSort(int[] array, SortingPanel panel) {
        super(array, panel);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }
}
