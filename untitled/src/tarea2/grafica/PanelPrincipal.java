package tarea2.grafica;
import tarea2.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;


public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private Ventana ventana;

    private JPanel principal = new JPanel() {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            pintarFondo(g);
        }
    };
    private Image imagenFondo;

    public PanelPrincipal(Ventana ventana) {
        cargarImagenFondo();
        ventana.getContentPane().add(this);

    }

    private void cargarImagenFondo() {
        try {
            URL imageURL = getClass().getResource("fondo.png");
            if (imageURL != null) {
                imagenFondo = new ImageIcon(imageURL).getImage();
            } else {
                System.err.println("No se pudo cargar la imagen de fondo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pintarFondo(Graphics g) {
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, principal.getWidth(), principal.getHeight(), principal);
        }
    }

    public JPanel getPanel() {
        return principal;
    }

}