public abstract class SortingAlgorithm {

    protected int[] array;
    protected SortingPanel panel;

    public SortingAlgorithm(int[] array, SortingPanel panel) {
        this.array = array;
        this.panel = panel;
    }

    public abstract void sort();

    protected void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        panel.setArray(array);
        try {
            Thread.sleep(10); // Small delay for visualization
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
