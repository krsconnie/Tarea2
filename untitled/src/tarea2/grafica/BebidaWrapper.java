package tarea2.grafica;
import tarea2.Logica.Bebida;

import javax.swing.*;
import java.awt.*;

public class BebidaWrapper extends JPanel {

    private Bebida bebida;
    private int x;
    private int y;

    public BebidaWrapper(Bebida bebida) {
        this.bebida = bebida;
    }

    public String consumir() {
        return bebida.consumir();
    }

    public int getSerie() {
        return bebida.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        bebida.setXY(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
    }
}