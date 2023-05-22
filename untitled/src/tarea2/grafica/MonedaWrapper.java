package tarea2.grafica;
import tarea2.Logica.Moneda;

import javax.swing.*;
import java.awt.*;

/**Clase MonedaWrapper funciona como envoltorio de la clase moneda que contiene la lógica
 * el wrapper especifica los métodos visuales*/
public class MonedaWrapper extends JPanel {

    private Moneda moneda;
    private JButton monedaV;
    private int x;
    private int y;

    /**Constructor crea un objeto de moneda, para poder usar sus métodos*/
    public MonedaWrapper(Moneda moneda) {
        this.moneda = moneda;
    }

    /**Método visualMon recibe un JButton y le agrega una imagen a este
     * @param monedaV*/
    public void visualMon(JButton monedaV){
       monedaV= new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
    }

    /**Método setXY para delimitar las coordenadas del objeto
     * @param x
     * @param y*/
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void paint(Graphics g){
    }

}