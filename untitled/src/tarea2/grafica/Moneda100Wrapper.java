package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class Moneda100Wrapper extends JPanel {

    private Moneda100 moneda100;
    private int x;
    private int y;

    public Moneda100Wrapper() {
        moneda100 = new Moneda100();
    }

    public int getValor() {
        return moneda100.getValor();
    }

    public Moneda getSerie() {
        return moneda100.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda100.setXY(x, y);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.black);
        g.drawString("" + moneda100.getSerie(), x + 3, y + 15);
    }
    public int compareTo(Moneda otraMoneda) {
        return moneda100.compareTo(otraMoneda);
    }
}