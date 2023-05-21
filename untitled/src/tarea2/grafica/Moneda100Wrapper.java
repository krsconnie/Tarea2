package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda100;

import javax.swing.*;
import java.awt.*;

public class Moneda100Wrapper extends JButton {

    private Moneda100 moneda100;
    public JButton monedaV100;
    private int x;
    private int y;

    public Moneda100Wrapper() {
        moneda100 = new Moneda100();
    }

    public int getValor() {
        return moneda100.getValor();
    }

    public int getSerie() {
        return moneda100.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda100.setXY(x, y);
    }
    public void visualMon(JButton monedaV100){
        monedaV100 = new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
    }
    public int compareTo(Moneda otraMoneda) {
        return moneda100.compareTo(otraMoneda);
    }
}