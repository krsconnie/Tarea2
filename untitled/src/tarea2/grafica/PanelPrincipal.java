package tarea2.grafica;
import tarea2.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;


public class PanelPrincipal extends JPanel implements MouseListener {
    private PanelComprador com;
    private PanelExpendedor exp;
    private Expendedor máquina;
    private Expendedor maquina;
    private JPanel principal = new JPanel() {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            pintarFondo(g);
        }
    };
    private Image imagenFondo;

    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador(maquina);

        cargarImagenFondo();

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

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}