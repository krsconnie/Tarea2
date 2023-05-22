package tarea2.grafica;

import tarea2.Logica.Moneda;
import tarea2.Logica.Moneda500;

import javax.swing.*;
import java.awt.*;

public class Moneda500Wrapper extends JButton {

    private Moneda500 moneda500;
    public JButton monedaV500;
    private int x;
    private int y;

    public Moneda500Wrapper() {
        moneda500 = new Moneda500();
    }

    public int getValor() {
        return moneda500.getValor();
    }

    public int getSerie() {
        return moneda500.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        moneda500.setXY(x, y);
    }

    public void visualMon(JButton monedaV500){
        monedaV500 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/moneda500.png")));
    }

    public int compareTo(Moneda otraMoneda) {
        return moneda500.compareTo(otraMoneda);
    }
}
