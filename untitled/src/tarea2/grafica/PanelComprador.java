package tarea2.grafica;

import tarea2.Logica.*;
import tarea2.Logica.Expendedor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelComprador extends JPanel {

    private final Comprador comprador;
    private final tarea2.Logica.Expendedor maquina;

    public PanelComprador(Expendedor maquina) {
        this.maquina = maquina;

        this.setBackground(Color.WHITE);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                comprarProducto();
            }
        });

        this.setLayout(new BorderLayout());

        comprador = new Comprador();
        this.add(comprador, BorderLayout.CENTER);
    }

    public void setMoneda(Moneda moneda) {
        comprador.setMoneda(moneda);
    }

    public void setCualProducto(int cualProducto) {
        comprador.setCualProducto(cualProducto);
    }

    public void comprarProducto() {
        try {
            comprador.comprarProducto(maquina);
            repaint();
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 100);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 200, 100);
        g.setColor(Color.WHITE);
        g.drawString("Comprar", 120, 95);
    }
}
