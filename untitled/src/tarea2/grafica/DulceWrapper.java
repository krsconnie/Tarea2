package tarea2.grafica;
import tarea2.Logica.Dulce;

import javax.swing.*;
import java.awt.*;

public class DulceWrapper extends JPanel {

    private Dulce dulce;
    private int x;
    private int y;

    public DulceWrapper(Dulce dulce) {
        this.dulce = dulce;
    }

    public String consumir() {
        return dulce.consumir();
    }

    public int getSerie() {
        return dulce.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        dulce.setXY(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
    }
}