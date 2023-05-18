package tarea2;
import javax.swing.JFrame;
public class Ventana extends JFrame {

    private PanelPrincipal panelPrincipal;

    public Ventana(String s) {
        crearVentana();
        panelPrincipal = new PanelPrincipal(this);

    }

    private void crearVentana(){
        this.setTitle("Tarea 2");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1280,720);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}