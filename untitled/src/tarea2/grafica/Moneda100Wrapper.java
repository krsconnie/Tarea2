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

    /**Constructor crea un objeto de moneda100, para poder usar sus métodos*/
    public Moneda100Wrapper() {
        moneda100 = new Moneda100();
    }

    /**Método setXY para delimitar las coordenadas del objeto
     * @param x
     * @param y*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }
    /**Método visualMon recibe un JButton y le agrega una imagen a este
     * @param monedaV100*/
    public void visualMon(JButton monedaV100){
        monedaV100 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/moneda100.png")));
    }
}