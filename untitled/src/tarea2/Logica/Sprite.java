package tarea2.Logica;
import tarea2.Logica.Bebida;

import java.awt.*;

/**
 *Subclase de Bebida,
 *representa la bebida Sprite
 */
public class Sprite extends Bebida {
    /**
     *Constructor para los productos Sprite
     */
    public Sprite() {
        super();
    }

    /**
     *Se sobreescribe el metodo consumir()
     *@return "sprite"
     */
    @Override
    public String consumir() {
        return "sprite";
    }
    /**
     * Método getSerie  devuelve la serie unica de Sprite
     * @return serie
     */
    public int getSerie() {
        int s = serie;
        return serie;
    }
}