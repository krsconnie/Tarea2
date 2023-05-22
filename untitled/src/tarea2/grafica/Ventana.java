package tarea2.grafica;
import tarea2.grafica.PanelPrincipal;

import javax.swing.JFrame;

/**Clase Ventana hereda de JFrame, que
 * creara la ventana en donde estará nuestro proyecto*/
public class Ventana extends JFrame {

    private PanelPrincipal panelPrincipal;
    /**Constructor de Ventana*/
    public Ventana() {
        crearVentana();
        panelPrincipal = new PanelPrincipal(this);
        getContentPane().add(panelPrincipal.getPanel());

    }
    /**Método crearVentana
     * para crear ventana*/
    private void crearVentana(){

        this.setTitle("Tarea 2");//Le pone el titulo a la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Define que al cerrar la ventana se cierra el programa
        this.setResizable(false);//Le quita la propiedad de cambiar de dimensiones
        this.setSize(1280,720);//El tamaño de la ventana
        this.setVisible(true);//Le da la propiedad de ser visible
        this.setLocationRelativeTo(null);//Hace que la ventana aparezca en el centro de la pantalla

    }

}