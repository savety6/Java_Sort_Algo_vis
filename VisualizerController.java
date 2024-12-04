public class VisualizerController {

    private SortingPanel panel;
    private SortingAlgorithm algorithm;

    public VisualizerController(SortingPanel panel) {
        this.panel = panel;
    }

    public void startSorting() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * panel.getHeight());
        }

        panel.setArray(array);

        // Choose the sorting algorithm
        // algorithm = new BubbleSort(array, panel); // or new SelectionSort(array, panel);
        algorithm = new SelectionSort(array, panel); // or new QuickSort(array, panel);
        // algorithm = new QuickSort(array, panel); // or new BubbleSort(array, panel);


        // Start the sorting on a new thread so it doesn’t freeze the GUI
        new Thread(() -> algorithm.sort()).start();
    }
}
