package tarea2.grafica;

import tarea2.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelExpendedor extends JPanel implements ActionListener {
    private final int COCA = 0;
    private final int SPRITE = 1;
    private final int SNICKER = 2;
    private final int SUPER8 = 3;

    private int posX, posY;
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

    public PanelExpendedor() {
        this.depVuelto = new Deposito<>(100);
        this.depMonedas = new Deposito<>(100);
        this.depCoca = new Deposito<>(4);
        this.depSprite = new Deposito<>(4);
        this.depSnick = new Deposito<>(4);
        this.depSup8 = new Deposito<>(4);
        this.aux = new Deposito<>(100);
        this.depCompraExitosa = new Deposito<>(1);

        for (int i = 0; i < 2; i++) {
            depCoca.addItem(new CocaCola());
            depSprite.addItem(new Sprite());
            depSnick.addItem(new Snickers());
            depSup8.addItem(new Super8());
        }

        for (int i = 0; i < 100; i++) {
            aux.addItem(new Moneda100());
        }

        // Set the preferred size of the panel
        setPreferredSize(new Dimension(600, 500));

        // Add action listeners to buttons
        JButton botonCocacola = new JButton("Coca-Cola");
        botonCocacola.addActionListener(this);
        JButton botonSprite = new JButton("Sprite");
        botonSprite.addActionListener(this);
        JButton botonSnickers = new JButton("Snickers");
        botonSnickers.addActionListener(this);
        JButton botonSuper8 = new JButton("Super8");
        botonSuper8.addActionListener(this);

        // Add buttons to the panel
        add(botonCocacola);
        add(botonSprite);
        add(botonSnickers);
        add(botonSuper8);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Moneda peseta = null;
        int cual = -1;

        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String buttonText = button.getText();

            if (buttonText.equals("Coca-Cola")) {
                cual = COCA;
            } else if (buttonText.equals("Sprite")) {
                cual = SPRITE;
            } else if (buttonText.equals("Snickers")) {
                cual = SNICKER;
            } else if (buttonText.equals("Super8")) {
                cual = SUPER8;
            }
        }

        try {
            comprarProducto(peseta, cual);
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException ex) {
            ex.printStackTrace();
            // Handle the exceptions as needed
        }

        repaint();
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
}
