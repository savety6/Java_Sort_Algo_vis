public class BubbleSort extends SortingAlgorithm {

    public BubbleSort(int[] array, SortingPanel panel) {
        super(array, panel);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }
}
