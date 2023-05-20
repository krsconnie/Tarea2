package tarea2.grafica;

import tarea2.Logica.Super8;

import javax.swing.*;
import java.awt.*;

public class Super8Wrapper extends JPanel {

    private Super8 super8;
    private int x;
    private int y;

    public Super8Wrapper() {
        super8 = new Super8();
    }

    public String consumir() {
        return super8.consumir();
    }

    public int getSerie() {
        return super8.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        super8.setXY(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.x, this.y, 10, 38);
        g.setColor(Color.black);
        g.drawString(""+ super8.getSerie(), this.x, this.y+20);
    }
}