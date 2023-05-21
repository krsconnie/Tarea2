package tarea2.grafica;

import tarea2.Logica.Deposito;
import tarea2.Logica.Producto;

import javax.swing.*;
import java.util.ArrayList;

public class DepProdWrapper<T> {

    protected Deposito<T> depProducto;
    private ArrayList<JLabel> depositoVisual;

    public DepProdWrapper() {
        depositoVisual = new ArrayList<>();
        depProducto = new Deposito<>(4);
    }

    public void addItemLabel(JLabel ProductoLabel) {
        depositoVisual.add(ProductoLabel);
    }

    public JLabel getProductoLabel() {
        if (depositoVisual.isEmpty()) {
            return null;
        } else {
            JLabel producto = depositoVisual.get(0);
            depositoVisual.remove(0);
            return producto;
        }
    }

    public JLabel seeProductoLabel(int i) {
        return depositoVisual.get(i);
    }

    public int getSerieOf(int i) {
        T item = depProducto.getItem(i);
        if (item instanceof Producto) {
            return ((Producto) item).getSerie();
        } else {
            return -1; // Valor predeterminado si no es un objeto de tipo Producto
        }
    }
}