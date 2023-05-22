package tarea2.Logica;
import tarea2.Logica.Bebida;

import java.awt.*;

/**
 *Subclase de Bebida,
 * representa la bebida CocaCola
 */
public class CocaCola extends Bebida {
    /**
     *Constructor para los productos CocaCola
     */
    public CocaCola() {
        super();
    }

    /**
     *Se sobreescribe el método consumir()
     *@return "cocacola
     */
    @Override
    public String consumir() {
        return "cocacola";
    }
    /**
     * Método getSerie  devuelve la serie unica de CocaCola
     * @return serie
     */
    public int getSerie() {
        int s = serie;
        return serie;
    }

}