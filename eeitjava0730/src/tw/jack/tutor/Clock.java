package tw.jack.tutor;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock extends JPanel implements Runnable {

    private Thread thread;

    public Clock() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height) / 2 - 10;

        // Get the current time
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int ampm = calendar.get(Calendar.AM_PM);
        String ampmText = ampm == Calendar.AM ? "AM" : "PM";

        // Draw the clock face
        g.setColor(Color.WHITE);
        g.fillOval((width / 2) - radius, (height / 2) - radius, 2 * radius, 2 * radius);
        g.setColor(Color.BLACK);
        g.drawOval((width / 2) - radius, (height / 2) - radius, 2 * radius, 2 * radius);

        // Draw the hour, minute, and second hands
        drawHand(g, width / 2, height / 2, radius - 40, (hour + minute / 60.0) * 30, 8);
        drawHand(g, width / 2, height / 2, radius - 20, minute * 6, 5);
        drawHand(g, width / 2, height / 2, radius - 10, second * 6, 2);

        // Draw clock numbers
        g.setFont(new Font("Arial", Font.BOLD, 16));
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians((i * 30) - 90);
            int x = (int) (width / 2 + (radius - 30) * Math.cos(angle));
            int y = (int) (height / 2 + (radius - 30) * Math.sin(angle)) + 5;
            g.drawString(String.valueOf(i), x - 10, y + 5);
        }

        // Draw the current time in the upper left corner
        g.setFont(new Font("Arial", Font.BOLD, 20));
        String timeText = String.format("%02d:%02d:%02d %s", hour, minute, second, ampmText);
        g.drawString(timeText, 10, 25);
    }

    private void drawHand(Graphics g, int x, int y, int length, double angle, int width) {
        double radian = Math.toRadians(angle - 90);
        int xEnd = x + (int) (length * Math.cos(radian));
        int yEnd = y + (int) (length * Math.sin(radian));
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(width));
        g2.drawLine(x, y, xEnd, yEnd);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Clock());
        frame.setVisible(true);
    }
}