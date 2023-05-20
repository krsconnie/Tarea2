package tarea2.Logica;

/**
 * Clase comprador que crea una entidad "comprador" que tendrá una moneda con la que
 * comprará un cierto producto en un expendedor
 */
public class Comprador {

    private String consumir;
    private int vuelto;
    private Moneda m;
    private int cualProducto;
    private Expendedor maquina;

    public Comprador() {
        vuelto = 0;
    }

    public void comprarProducto(Moneda m, int cualProducto, Expendedor maquina) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.m = m;
        this.cualProducto = cualProducto;
        this.maquina = maquina;

        Producto paquete = maquina.comprarProducto(m, cualProducto);

        while (true) {
            Moneda devuelve = maquina.getVuelto();
            if (devuelve == null) {
                break;
            }

            vuelto += devuelve.getValor();
        }

        if (paquete != null) {
            consumir = paquete.consumir();
        }
    }
    /**
     * Método que permite saber el vuelto resultante
     * después de comprar
     * @return vuelto
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * Método que permite saber
     * que se comsumió después de comprar
     * @return consumir
     */
    public String queConsumiste() {
        return consumir;
    }
    public void setCualProducto(int cualProducto) {
        this.cualProducto = cualProducto;
    }

    public void setMoneda(Moneda m){
        this.m = m;
    }

    public Moneda getM() {
        return m;
    }

    public int getCualProducto() {
        return cualProducto;
    }
}