package tarea2.Logica;
import tarea2.Logica.Moneda;


/**
 Subclase de Moneda,
 representa la moneda de 100 pesos
 */
public class Moneda100 extends Moneda {
    /**
     *Constructor de Moneda100
     *le otorga a la variable (llamada con super)
     *valor = 100
     */
    public Moneda100() {
        super();
        super.valor = 100;
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