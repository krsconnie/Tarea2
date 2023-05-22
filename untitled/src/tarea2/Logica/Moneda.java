package tarea2.Logica;
/**
 *Super clase "modelo"
 * para las monedas de distinto valor
 */
public abstract class Moneda implements Comparable {
    protected int valor;
    protected int serie;
    public int x, y;
    /**
     * Constructor de Moneda
     */
    public Moneda() {
    }
    public Moneda getMoneda(Moneda moneda) {
        Moneda aux = moneda;
        moneda = null;
        return aux;
    }
    public abstract int getValor();

    /**
     * getSerie() no tiene parametros de entrada
     * retorna el valor protegido serie
     */
    public int getSerie() {
        return serie;
    }
    /**
     * Método compareTo para comparar
     * objetos de tipo Moneda
     */
    public int compareTo(Moneda otraMoneda) {
        if (this.valor < otraMoneda.valor) {
            return -1;
        } else if (this.valor > otraMoneda.valor) {
            return 1;
        } else {
            return 0;
        }
    }
    /**Método toString devuelve
     * el valor de la moneda y el numero*/
    public String toString(){
        return "VALOR MONEDA:"+ getValor() + "\n NUMERO DE SERIE" +getSerie();
    }
}