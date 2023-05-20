package tarea2.grafica;

import tarea2.Logica.Snickers;

import javax.swing.*;
import java.awt.*;

public class SnickersWrapper extends JPanel {

    private Snickers snickers;
    private int x;
    private int y;

    public SnickersWrapper() {
        snickers = new Snickers();
    }

    public String consumir() {
        return snickers.consumir();
    }

    public int getSerie() {
        return snickers.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        snickers.setXY(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(this.x, this.y, 10, 38);
        g.setColor(Color.black);
        g.drawString(""+snickers.getSerie(), this.x, this.y+20);
    }
}