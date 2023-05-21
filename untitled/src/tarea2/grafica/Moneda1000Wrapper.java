package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda1000;

import javax.swing.*;
import java.awt.*;

public class Moneda1000Wrapper extends JButton {

    private Moneda1000 moneda1000;
    private JButton monedaV1000;
    private int x;
    private int y;

    public Moneda1000Wrapper() {
        moneda1000 = new Moneda1000();
    }

    public int getValor() {
        return moneda1000.getValor();
    }

    public int getSerie() {
        return moneda1000.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda1000.setXY(x, y);
    }
    public void visualMon(JButton monedaV1000){
        monedaV1000 = new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
    }

    public int compareTo(Moneda otraMoneda) {
        return moneda1000.compareTo(otraMoneda);
    }
}
