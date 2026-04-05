package tugas_2;

import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.Color;

public class JavaApplet extends JFrame {
    public void paint (Graphics g) {
        super.paint(g);
        g.drawString("Membuat Program Java Dengan Applet", 25, 25);
        g.setColor(Color.GREEN);
        g.drawString("Membuat Program Java Sangat Sangat Menyenangkan :) ", 25, 45);
    }
}   

