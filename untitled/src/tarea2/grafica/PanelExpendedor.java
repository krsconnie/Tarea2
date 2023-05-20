package tarea2.grafica;

import tarea2.Logica.*;

import java.awt.*;
import javax.swing.*;

/** Un expendedor que tendrá depósitos para cada producto y para el vuelto, cuenta con la interfaz gráfica */
public class Expendedor extends JPanel {

    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKER = 3;
    public static final int SUPER8 = 4;

    private final int precioB = 600;
    private final int precioD = 500;
    private Deposito<CocaCola> depCoca;
    private Deposito<Sprite> depSprite;
    private Deposito<Snickers> depSnick;
    private Deposito<Super8> depSup8;
    private Deposito<Moneda> depVuelto;
    private Deposito<Moneda> depMonedas;
    private Deposito<Moneda100> aux;
    private Deposito<Producto> depCompraExitosa;

    public Expendedor(int n) {
        this.depVuelto = new Deposito<>(100);
        this.depMonedas = new Deposito<>(100);
        this.depCoca = new Deposito<>(4);
        this.depSprite = new Deposito<>(4);
        this.depSnick = new Deposito<>(4);
        this.depSup8 = new Deposito<>(4);
        this.aux = new Deposito<>(100);
        this.depCompraExitosa = new Deposito<Producto>(1);

        for (int i = 0; i < n; i++) {
            depCoca.addItem(new CocaCola());
            depSprite.addItem(new Sprite());
            depSnick.addItem(new Snickers());
            depSup8.addItem(new Super8());
        }

        for (int i = 0; i < 100; i++) {
            aux.addItem(new Moneda100());
        }
    }

    public void comprarProducto(Moneda peseta, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        if (peseta == null) {
            throw new PagoIncorrectoException("No se recibió el pago.");
        }

        Producto ret = null;
        int vuelto = 0;

        switch (cual) {
            case COCA: {
                if (peseta.getValor() >= precioB) {
                    vuelto = peseta.getValor() - precioB;
                    ret = depCoca.getItem();
                    break;
                } else {
                    throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
                }
            }
            case SPRITE: {
                if (peseta.getValor() >= precioB) {
                    vuelto = peseta.getValor() - precioB;
                    ret = depSprite.getItem();
                    break;
                } else {
                    throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
                }
            }
            case SNICKER: {
                if (peseta.getValor() >= precioD) {
                    vuelto = peseta.getValor() - precioD;
                    ret = depSnick.getItem();
                    break;
                } else {
                    throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
                }
            }
            case SUPER8: {
                if (peseta.getValor() >= precioD) {
                    vuelto = peseta.getValor() - precioD;
                    ret = depSup8.getItem();
                    break;
                } else {
                    throw new PagoInsuficienteException("El pago efectuado no es suficiente.");
                }
            }
        }

        if (ret != null) {
            vuelto = vuelto / 100;
            for (int i = 0; i < vuelto; i++) {
                depVuelto.addItem(aux.getItem());
            }
            peseta = null;
            depCompraExitosa.addItem(ret);
        } else {
            depVuelto.addItem(peseta);
            throw new NoHayProductoException("No hay stock del producto seleccionado.");
        }
    }

    public Producto getProducto() {
        return depCompraExitosa.getItem();
    }

    public void rellenarDepositosVacios() {
        if (depCoca.estaVacio()) {
            depCoca.addItem(new CocaCola());
        }
        if (depSprite.estaVacio()) {
            depSprite.addItem(new Sprite());
        }
        if (depSnick.estaVacio()) {
            depSnick.addItem(new Snickers());
        }
        if (depSup8.estaVacio()) {
            depSup8.addItem(new Super8());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar el expendedor como un rectángulo
        g.drawRect(50, 50, 200, 400);

        // Dibujar los depósitos de productos
        depCoca.dibujar(g, 60, 60);
        depSprite.dibujar(g, 60, 160);
        depSnick.dibujar(g, 60, 260);
        depSup8.dibujar(g, 60, 360);

        // Dibujar el depósito de vuelto
        depVuelto.dibujar(g, 300, 200);

        // Dibujar el depósito de monedas
        depMonedas.dibujar(g, 500, 200);

        // Dibujar el depósito de compra exitosa (con un producto)
        depCompraExitosa.dibujar(g, 150, 460);
    }
}
