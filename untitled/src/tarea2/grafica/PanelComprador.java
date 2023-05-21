package tarea2.grafica;

import tarea2.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {

    private final Expendedor maquina;
    private final JButton comprarButton;
    private JPanel panel;
    private JLabel moneda1;
    private JLabel moneda2;
    private Moneda moneda;
    private int posX, posY;
    private int posChaucheroX, posChaucheroY;
    private int posXDepProductos, posYDepProductos;

    private DepProdWrapper depProductos;
    private Deposito<Moneda100> depVuelto;

    public PanelComprador(JPanel panel) {

        depProductos = new DepProdWrapper();

        this.panel = panel;

        depVuelto = new Deposito<Moneda100>(12);
        posChaucheroX = 0;
        posChaucheroY = 0;

        compradorSetPos(640, 50);


        maquina = new Expendedor();

        moneda1 = null;
        moneda2 = null;

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

    //Posiciones
    public void compradorSetPos(int x, int y) {
        posX = x;
        posY = y;
    }

    public void chaucheroSetPos(int x, int y) {
        posChaucheroX += x;
        posChaucheroY += y;
    }

    public void depProductoSetPos(int x, int y) {
        posXDepProductos = x;
        posYDepProductos = y;
    }


    public void addMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public void setProducto(Producto producto) {
        depProductos.depProducto.addItem(producto);
    }

    public void setVuelto(Moneda100 moneda) {
        depVuelto.addItem(moneda);
    }

    //JLabel
    public void setProductoLabel(JLabel producto) {
        depProductos.addItemLabel(producto);
    }

    public void comprarProducto() {
        try {
            Moneda moneda = maquina.getMoneda();
            int cual = maquina.getCual();
            maquina.comprarProducto(moneda, cual);
            repaint();
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void visualizarComprador() {
        JLabel compradorVisible = new JLabel(new ImageIcon(this.getClass().getResource("pizza.png")));
        compradorVisible.setLayout(null);
        compradorVisible.setBounds(posX, posY, 350, 350);
        panel.add(compradorVisible);
    }

    private void colocarMonedas() {

        // moneda100
        JButton moneda100 = new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
        moneda100.setBounds(posChaucheroX + 72, posChaucheroY + 85, 35, 35);
        moneda100.setEnabled(true);
        moneda100.setMnemonic('1');
        panel.add(moneda100);

        // moneda500
        JButton moneda500 = new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
        moneda500.setBounds(posChaucheroX + 112, posChaucheroY + 85, 35, 35);
        moneda500.setEnabled(true);
        moneda500.setMnemonic('2');
        panel.add(moneda500);

        // moneda1000
        JButton moneda1000 = new JButton(new ImageIcon(this.getClass().getResource("Z.png")));
        moneda1000.setBounds(posChaucheroX + 152, posChaucheroY + 85, 35, 35);
        moneda1000.setEnabled(true);
        moneda1000.setMnemonic('1');
        panel.add(moneda1000);

    }

    public void mostrarMoneda(Moneda moneda) {
        String aux = "" + moneda.getClass();
        switch (aux) {
            case "class tarea2.Moneda100":
                moneda1 = new JLabel(new ImageIcon(this.getClass().getResource("Z.png")));
                panel.add(moneda2);
                break;
            case "class tarea2.Moneda500":
                moneda2 = new JLabel(new ImageIcon(this.getClass().getResource("Z.png")));
                break;
            case "class tarea2.Moneda1000":
                moneda2 = new JLabel(new ImageIcon(this.getClass().getResource("Z.png")));
                break;
            default:
                return;
        }
        if (moneda1 != null) {
            panel.remove(moneda1);
        }
    }
}