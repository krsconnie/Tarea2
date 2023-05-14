package tarea2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

    public class Ambiente extends JPanel implements MouseListener {
        private int state;
        private Comprador com;
        private Expendedor exp;
        private PanelSur ps;
        public Ambiente() {

            this.state = 0;
            this.setLayout(new BorderLayout());

            this.exp = new Expendedor(10, 1500, 600);
            this.exp.setXY(50, 60);

            this.com = new Comprador(this.exp);
            this.com.setXY(550, 150);

            this.setBackground(Color.white);
            this.addMouseListener(this);

            this.ps = new PanelSur(this.com, this);
            this.add(ps, BorderLayout.SOUTH);

        }
}
