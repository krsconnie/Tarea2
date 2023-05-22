package tarea2.grafica;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;

public class PanelPrincipal extends JPanel {
    //* CONSTRUCTOR
    public PanelPrincipal() {
        super(null); // this.setLayout(null);

        // Fondo
        System.out.println("PATH: " + getClass().getResource("/Resources/fondo.png"));

        JLabel wallpaper = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("/Resources/fondo.png")).getImage().getScaledInstance(1200, 720, Image.SCALE_SMOOTH)));
        // JLabel wallpaper = new JLabel(new ImageIcon(getClass().getResource("/Resources/fondo.png")));
        wallpaper.setBounds(0, 0, 1200, 720);

        add(wallpaper);

        this.setPreferredSize(new Dimension(wallpaper.getWidth(), wallpaper.getHeight()));
    }
}
