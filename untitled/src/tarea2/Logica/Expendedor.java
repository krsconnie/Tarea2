package tarea2.Logica;

/**Un
 * expendedor que tendrá depositos para cada producto
 * y para el vuelto
 */
public class Expendedor {
    /**
     * Se declaran enteros que hacen referencia a cada deposito según su tipo de producto
     * Se declara un entero que será el precio del producto escogido
     * Se declaran depositos de cada producto, de vuelto y uno auxiliar
     */
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKER = 3;
    public static final int SUPER8 = 4;
    private final int precioB = 600;
    private final int precioD = 500;

    private Moneda moneda;
    private int cual;
    private Deposito<CocaCola> depCoca;
    private Deposito<Sprite> depSprite;
    private Deposito<Snickers> depSnick;
    private Deposito<Super8> depSup8;

    private Deposito<Moneda> depVuelto;
    private Deposito<Moneda100> aux;
    private Deposito<Producto> depCompraExitosa;
    private Deposito <Producto> productosComprados;

    /**
     * Constructor de Expendedor
     */
    public Expendedor() {
        this.depVuelto = new Deposito<Moneda>(100);
        depCoca = new Deposito<>(2);
        depSprite = new Deposito<>(2);
        depSnick = new Deposito<>(2);
        depSup8 = new Deposito<>(2);
        aux = new Deposito<>(100);
        depCompraExitosa = new Deposito<Producto>(1);
        productosComprados = new Deposito<Producto>(8);

        for (int i = 0; i < 2; i++) {
            depCoca.addItem(new CocaCola());
            depSprite.addItem(new Sprite());
            depSnick.addItem(new Snickers ( ));
            depSup8.addItem(new Super8());
        }

        for (int i = 0; i < 100; i++) {
            aux.addItem(new Moneda100());
        }
    }
    /**
     *Método comprarProducto permite comprar
     *(o no en caso de no ser posible)
     *un producto de la maquina expendedora
     *@param peseta , moneda
     * @param cual, el tipo de producto a comprar
     * @return  ret
     */
    public Producto comprarProducto(Moneda peseta, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Producto ret = null;
        int vuelto = 0;

        if (peseta == null) {

            throw new PagoIncorrectoException("No se recibió el pago.");

        }

        switch (cual) {
            case 1: {
                if (peseta.getValor() >= precioB) {
                    vuelto = peseta.getValor() - precioB;
                    ret = depCoca.getItem();
                    break;
                }else throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
            }
            case 2: {
                if (peseta.getValor() >= precioB) {
                    vuelto = peseta.getValor() - precioB;
                    ret = depSprite.getItem ();
                    break;
                }else throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
            }
            case 3: {
                if (peseta.getValor() >= precioD) {
                    vuelto = peseta.getValor() - precioD;
                    ret = depSnick.getItem();
                    break;
                }else throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
            }
            case 4: {
                if (peseta.getValor() >= precioD) {
                    vuelto = peseta.getValor() - precioD;
                    ret = depSup8.getItem();
                    break;
                }else throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
            }
        }
        if (ret != null) {
            vuelto = vuelto / 100;
            for (int i = 0; i < vuelto; i++) {
                depVuelto.addItem(aux.getItem());
            }
            peseta = null;
        } else {
            depVuelto.addItem(peseta);
            throw new NoHayProductoException("No hay stock del producto seleccionado.");
        }
        return ret;
    }
    /**
     * Método getVuelto, para entregar el vuelto
     */
    public Moneda getVuelto() {
        return depVuelto.getItem();
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public int getCual() {
        return cual;
    }

    /**Método rellenarDepositosVacios, para rellenar el stock que se ha acabado*/
    public void rellenarDepositosVacios() {
        if (depCoca.estaVacio()) {
            depCoca.addItem(new CocaCola());
            depCoca.addItem(new CocaCola());
        }
        if (depSprite.estaVacio()) {
            depSprite.addItem(new Sprite());
            depSprite.addItem(new Sprite());
        }
        if (depSnick.estaVacio()) {
            depSnick.addItem(new Snickers());
            depSnick.addItem(new Snickers());
        }
        if (depSup8.estaVacio()) {
            depSup8.addItem(new Super8());
            depSup8.addItem(new Super8());
        }
    }
}
