package tugas_2;

import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.Color;

public class JavaApplet extends JFrame {
    public void paint (Graphics g) {
        super.paint(g);
        g.drawString("Membuat Program Java Dengan Applet", 25, 25);
        g.setColor(Color.RED);
        g.drawString("Membuat Program Java Sangat Sangat Menyenangkan :) ", 25, 45);
    }
    public static void main(String[] args) {
        JavaApplet frame = new JavaApplet();
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   

