package tarea2.grafica;
import tarea2.Logica.Moneda;

import javax.swing.*;
import java.awt.*;

public class MonedaWrapper extends JPanel {

    private Moneda moneda;

    public MonedaWrapper(Moneda moneda) {
        this.moneda = moneda;
    }

    public int getValor() {
        return moneda.getValor();
    }

    public Moneda getSerie() {
        return moneda.getSerie();
    }

    public void setXY(int x, int y) {
        moneda.setXY(x, y);
    }
    public void paint(Graphics g){
    }

    public int compareTo(Moneda otraMoneda) {
        return moneda.compareTo(otraMoneda);
    }
}