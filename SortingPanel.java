import javax.swing.*;
import java.awt.*;

public class SortingPanel extends JPanel {

    private int[] array;

    public SortingPanel() {
        // Initialize the array to be sorted (randomized)
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * getHeight());
        }
    }

    public void setArray(int[] array) {
        this.array = array;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for (int i = 0; i < array.length; i++) {
            g.fillRect(i * (getWidth() / array.length), getHeight() - array[i], (getWidth() / array.length), array[i]);
        }
    }
}
