package tarea2;
import javax.swing.*;
import java.awt.*;
import java.net.URL;


public class PanelPrincipal{
    JPanel principal = new JPanel();
    private Image imagenFondo;

     public void PanelPrincipal(){
     }
     public void fondoPanel(){

        imagenFondo = new ImageIcon("fondo.jpg").getImage();

     }
     public void pintarFondo(Graphics g){
         g.drawImage(imagenFondo,0,0, 1280, 720,principal);
     }


}