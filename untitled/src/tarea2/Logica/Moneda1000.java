package tarea2.Logica;
import tarea2.Logica.Moneda;

/**
 * Subclase de Moneda, representa la moneda de 1000 pesos
 */
public class Moneda1000 extends Moneda {
    /**
     * Constructor de Moneda1000
     * le otorga a la variable valor = 1000
     */
    public Moneda1000() {
        super();
        super.valor = 1000;
    }
    /**
     * metodo getValor() no tiene parametros
     * @return int valor, cantidad de $
     */
    public int getValor() {
        int valor = super.valor;
        return valor;
    }
    /**Método que deriva de la interfaz comparable*/
    @Override
    public int compareTo() {
        return 0;
    }

    /**Método toString devuelve
     * el valor de la moneda y el numero*/
    public String toString(){
        return "VALOR MONEDA:"+ getValor() + "\n NUMERO DE SERIE" +getSerie();
    }
}