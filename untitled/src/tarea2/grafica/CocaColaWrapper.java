package tarea2.grafica;

import tarea2.Logica.CocaCola;

import javax.swing.*;
import java.awt.*;

public class CocaColaWrapper extends JPanel {

    private CocaCola cocacola;
    private int x;
    private int y;

    public CocaColaWrapper() {
        cocacola = new CocaCola();
    }

    public String consumir() {
        return cocacola.consumir();
    }

    public int getSerie() {
        return cocacola.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        cocacola.setXY(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x, y, 17, 30);
        g.setColor(Color.black);
        g.drawString("" + cocacola.getSerie(), x, y + 20);
    }
}