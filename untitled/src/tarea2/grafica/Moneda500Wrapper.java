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


    /**Constructor crea un objeto de moneda500, para poder usar sus métodos*/
    public Moneda500Wrapper() {
        moneda500 = new Moneda500();
    }


    /**Método setXY para delimitar las coordenadas del objeto
     * @param x
     * @param y*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;

    }
    /**Método visualMon recibe un JButton y le agrega una imagen a este
     * @param monedaV500*/
    public void visualMon(JButton monedaV500){
        monedaV500 = new JButton(new ImageIcon(this.getClass().getResource("/recursos/moneda500.png")));
    }
}
