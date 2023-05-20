package tarea2.grafica;

import tarea2.Logica.Sprite;

import javax.swing.*;
import java.awt.*;

public class SpriteWrapper extends JPanel {

    private Sprite sprite;
    private int x;
    private int y;

    public SpriteWrapper() {
        sprite = new Sprite();
    }

    public String consumir() {
        return sprite.consumir();
    }

    public int getSerie() {
        return sprite.getSerie();
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        sprite.setXY(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(this.x, this.y, 17, 30);
        g.setColor(Color.black);
        g.drawString(""+sprite.getSerie(), this.x, this.y+20);
    }
}