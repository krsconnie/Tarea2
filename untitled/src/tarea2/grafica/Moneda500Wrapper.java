package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda500;

import javax.swing.*;
import java.awt.*;

public class Moneda500Wrapper extends JPanel {

    private Moneda500 moneda500;
    private int x;
    private int y;

    public Moneda500Wrapper() {
        moneda500 = new Moneda500();
    }

    public int getValor() {
        return moneda500.getValor();
    }

    public Moneda getSerie() {
        return moneda500.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda500.setXY(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(255,148,8));
        g.fillOval(this.x, this.y, 20, 20);
        g.setColor(Color.black);
        g.drawString(""+moneda500.getSerie(), this.x+3, this.y+15);
    }

    public int compareTo(Moneda otraMoneda) {
        return moneda500.compareTo(otraMoneda);
    }
}
