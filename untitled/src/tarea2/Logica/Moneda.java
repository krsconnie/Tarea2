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
    public abstract int getValor();

    /**
     * getSerie() no tiene parametros de entrada
     * retorna el valor protegido serie
     */
    public Moneda getSerie() {
        return this;
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
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}