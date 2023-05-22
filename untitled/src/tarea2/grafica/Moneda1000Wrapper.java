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


    /**Constructor crea un objeto de moneda1000, para poder usar sus métodos*/
    public Moneda1000Wrapper() {
        moneda1000 = new Moneda1000();
    }


    /**Método setXY para delimitar las coordenadas del objeto
     * @param x
     * @param y*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }
    /**Método visualMon recibe un JButton y le agrega una imagen a este
     * @param monedaV1000*/
    public void visualMon(JButton monedaV1000){
        monedaV1000 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/moneda1000.png")));
    }

}
