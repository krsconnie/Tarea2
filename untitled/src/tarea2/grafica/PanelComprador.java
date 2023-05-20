package tarea2.grafica;

import tarea2.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {

    private final Expendedor maquina;
    private final JButton comprarButton;

    public PanelComprador(Expendedor maquina) {
        this.maquina = maquina;

        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());

        comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comprarProducto();
            }
        });

        this.add(comprarButton, BorderLayout.CENTER);
    }

    public void comprarProducto() {
        try {
            Moneda moneda = maquina.getMoneda();
            int cual = maquina.getCual();
            maquina.comprarProducto(moneda,cual);
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