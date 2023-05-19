package tarea2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;


public class PanelPrincipal{
    JPanel principal = new JPanel();
    public Image imagenFondo;
    public URL fondo;

     public void PanelPrincipal(){
     }
     public void fondoPanel(){
        fondo = this.getClass().getResource("/Tarea2/recursos/fondo.jpg");
        
     }

}