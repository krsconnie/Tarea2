package tarea2.grafica;

import tarea2.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class PanelPrincipal extends JPanel {

    private Ventana ventana;
    JPanel principal = new JPanel();
    public PanelPrincipal(Ventana ventana) {
        this.ventana = ventana;

        JLabel wallpaper = new JLabel(new ImageIcon(this.getClass().getResource("/recursos/fondo.png")));
        wallpaper.setLayout(null);
        wallpaper.setBounds(0, 0, 1200, 720);
        add(wallpaper);
    }

    public JPanel getPanel() {
        return principal;
    }
}
