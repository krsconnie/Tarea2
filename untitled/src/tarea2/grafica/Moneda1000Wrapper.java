package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda1000;

import javax.swing.*;
import java.awt.*;

public class Moneda1000Wrapper extends JPanel {

    private Moneda1000 moneda1000;
    private int x;
    private int y;

    public Moneda1000Wrapper() {
        moneda1000 = new Moneda1000();
    }

    public int getValor() {
        return moneda1000.getValor();
    }

    public Moneda getSerie() {
        return moneda1000.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda1000.setXY(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(173,255,8));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+moneda1000.getSerie(), this.x+3, this.y+15);
    }
    public int compareTo(Moneda otraMoneda) {
        return moneda1000.compareTo(otraMoneda);
    }
}
