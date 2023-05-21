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
    private DepMonWrapper depVuelto;

    public PanelComprador(JPanel panel) {

        depProductos = new DepProdWrapper(4);

        this.panel = panel;

        depVuelto = new DepMonWrapper(12);
        posChaucheroX = 0;
        posChaucheroY = 0;

        compradorSetPos(640, 50);


        maquina = new Expendedor();

        moneda1 = null;
        moneda2 = null;

        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());

        visualizarComprador();
        depositoProductosComprados();
        depositoMonedasRetornadas();
        colocarChauchero();

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

    //JLabel
    public void setProductoLabel(JLabel producto) {
        depProductos.addItemLabel(producto);
    }
    public void setVueltoLabel(JLabel moneda) {
        depVuelto.addItemLabel(moneda);
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

        JLabel compradorVisible = new JLabel(new ImageIcon("pizza.jpeg"));
        compradorVisible.setLayout(null);
        compradorVisible.setBounds(posX, posY, 350, 350);
        panel.add(compradorVisible);
    }
    private void colocarChauchero() {
        JLabel menuMonedas = new JLabel(new ImageIcon("chauchero.png"));
        menuMonedas.setLayout(null);
        chaucheroSetPos(0, 360);
        colocarMonedas();
        menuMonedas.setBounds(posChaucheroX, posChaucheroY, 350, 213);
        panel.add(menuMonedas);
    }

    private void colocarMonedas() {

        Moneda100Wrapper moneda100V = new Moneda100Wrapper();
        moneda100V.visualMon(moneda100V.monedaV100);
        moneda100V.setBounds(posChaucheroX + 72, posChaucheroY + 85, 35, 35);
        moneda100V.setEnabled(true);
        moneda100V.setMnemonic('1');
        panel.add(moneda100V);

        Moneda500Wrapper moneda500V = new Moneda500Wrapper();
        moneda500V.visualMon(moneda500V.monedaV500);
        moneda500V.setBounds(posChaucheroX + 112, posChaucheroY + 85, 35, 35);
        moneda500V.setEnabled(true);
        moneda500V.setMnemonic('2');
        panel.add(moneda500V);


        Moneda1000Wrapper moneda1000V = new Moneda1000Wrapper();
        moneda1000V.visualMon(moneda500V.monedaV500);
        moneda1000V.setBounds(posChaucheroX + 152, posChaucheroY + 85, 35, 35);
        moneda1000V.setEnabled(true);
        moneda1000V.setMnemonic('1');
        panel.add(moneda1000V);

    }

    public void mostrarMoneda(Moneda moneda) {
        String aux = "" + moneda.getClass();
        switch (aux) {
            case "class tarea2.Moneda100":
                moneda1 = new JLabel(new ImageIcon("Z.png"));
                panel.add(moneda2);
                break;
            case "class tarea2.Moneda500":
                moneda2 = new JLabel(new ImageIcon("Z.png"));
                break;
            case "class tarea2.Moneda1000":
                moneda2 = new JLabel(new ImageIcon("Z.png"));
                break;
            default:
                return;
        }
        if (moneda1 != null) {
            panel.remove(moneda1);
        }
    }
    public void ingresarMoneda() {
        if (moneda1 != null) {
            panel.remove(moneda1);
            panel.repaint();
        }
    }
    public void mostrarVuelto() {
        JLabel auxLabel;
        Boolean flag = true;
        int aux = 0;
        for (int i = 0; i < depVuelto.depMoneda.getSize(); i++) {
            auxLabel = depVuelto.seeMonedaLabel(i);
            if (i < 12) {
                auxLabel.setBounds(posChaucheroX + 10, posChaucheroY + 350 - 30 * i, 20, 20);
            } else if (i < 24) {
                auxLabel.setBounds(posChaucheroX + 40, posChaucheroY + 350 - 30 * aux, 20, 20);
                aux++;
            } else {
                flag = false;
            }
            if (flag) {
                panel.add(auxLabel);
                panel.setComponentZOrder(auxLabel, 0);
                panel.repaint();
            }
        }
    }
    public void mostrarProductos() {
        JLabel auxLabel;
        for (int i = 0; i < depProductos.depProducto.getSize(); i++) {
            if (i < 5) {
                auxLabel = depProductos.seeProductoLabel(i);
                auxLabel.setBounds(posXDepProductos + 20, posYDepProductos + 310 - 70 * i, 30, 60);  // serie mayor a menor
                panel.add(auxLabel);
                panel.setComponentZOrder(auxLabel, 0);
                panel.repaint();
            }
        }
    }
    public void depositoProductosComprados() {
        JLabel depositoBebidasLabel = new JLabel(new ImageIcon("dep.png"));
        depProductoSetPos(345, 20);
        depositoBebidasLabel.setBounds(posXDepProductos , posYDepProductos , 70, 400);
        panel.add(depositoBebidasLabel);
    }
    public void depositoMonedasRetornadas() {
        JLabel depositoMonedasLabel = new JLabel(new ImageIcon("/recursos/depositoBebida.png"));
        chaucheroSetPos(425, 20);
        depositoMonedasLabel.setBounds(posChaucheroX , posChaucheroY, 70, 400);
        panel.add(depositoMonedasLabel);
    }

}