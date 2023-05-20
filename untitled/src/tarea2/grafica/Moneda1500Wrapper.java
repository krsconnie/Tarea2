package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda1500;

import javax.swing.*;
import java.awt.*;

public class Moneda1500Wrapper extends JPanel {

    private Moneda1500 moneda1500;
    private int x;
    private int y;

    public Moneda1500Wrapper() {
        moneda1500 = new Moneda1500();
    }

    public int getValor() {
        return moneda1500.getValor();
    }

    public Moneda getSerie() {
        return moneda1500.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda1500.setXY(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(255,148,8));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+moneda1500.getSerie(), this.x+3, this.y+15);
    }

    public int compareTo(Moneda otraMoneda) {
        return moneda1500.compareTo(otraMoneda);
    }
}
