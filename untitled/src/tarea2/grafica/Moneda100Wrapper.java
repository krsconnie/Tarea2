package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class Moneda100Wrapper extends JPanel {

    private Moneda moneda;
    private int x;
    private int y;

    public Moneda100Wrapper() {
        moneda = new Moneda();
    }

    public int getValor() {
        return moneda.getValor();
    }

    public Moneda getSerie() {
        return moneda.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda.setXY(x, y);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.black);
        g.drawString("" + moneda.getSerie(), x + 3, y + 15);
    }
    public int compareTo(Moneda otraMoneda) {
        return moneda.compareTo(otraMoneda);
    }
}