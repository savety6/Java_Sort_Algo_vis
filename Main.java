import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Create a JFrame for the visualizer
        JFrame frame = new JFrame("Sorting Algorithm Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create the panel where the sorting will be visualized
        SortingPanel panel = new SortingPanel();
        frame.add(panel);

        frame.setVisible(true);

        // Controller to handle sorting
        VisualizerController controller = new VisualizerController(panel);
        controller.startSorting();
    }
}