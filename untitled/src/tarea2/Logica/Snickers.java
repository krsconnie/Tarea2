package tarea2.Logica;
import tarea2.Logica.Dulce;

import java.awt.*;
    /**
     *Subclase de Dulce,
     *representa los Snickers
     */
    public class Snickers extends Dulce {
        /**
         *Constructor para Snickers
         */
        public Snickers(){super();}
        /**
         *Se sobreescribe el metodo consumir()
         *@return "Snicker"
         */
        @Override
        public String consumir() {return "Snicker";}
        /**
         * Método getSerie  devuelve la serie unica de Snicker
         * @return serie
         */
        public int getSerie() {
            int s = serie;
            return serie;
        }
    }

