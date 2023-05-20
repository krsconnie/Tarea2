package tarea2.Logica;
import tarea2.Logica.Dulce;

import java.awt.*;
/**
 *Subclase de Dulce,
 *representa los Super8
 */
public class Super8 extends Dulce {
    /**
     *Constructor para los Super8
     */
    public Super8(){super();}
    @Override
    public void paint(Graphics g) {

    }
    /**
     *Se sobreescribe el metodo consumir()
     *@return String "Super8"
     */

    public String consumir(){return "Super8";}
}