// Create a line drawing function that takes 2 parameters:
// The x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// Draw 3 lines with that function. Use loop for that.

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics) {

        int min = 1;
        int max = 20;

        int x = 1;
        int y = 2;
        int i = 3;

        drawline(x,y, graphics, i);
    }

    private static void drawline(int x, int y, Graphics graphics, int i) {
        for (int j = 0; j < i ; j++) {
            Random randomNum = new Random();
            graphics.setColor(Color.RED);
            graphics.drawLine((WIDTH / 2), (HEIGHT / 2), (x+randomNum.nextInt()), (y+randomNum.nextInt()));
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}