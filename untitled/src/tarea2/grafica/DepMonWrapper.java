package tarea2.grafica;

import tarea2.Logica.Deposito;
import tarea2.Logica.Moneda;

import javax.swing.*;
import java.util.ArrayList;

public class DepMonWrapper<T> {

    protected Deposito<T> depMoneda;
    private ArrayList<JLabel> depositoVisual;

    public DepMonWrapper(int n) {
        depositoVisual = new ArrayList<>();
        depMoneda = new Deposito<>(n);
    }

    public void addItemLabel(JLabel ProductoLabel) {
        depositoVisual.add(ProductoLabel);
    }

    public JLabel getProductoLabel() {
        if (depositoVisual.isEmpty()) {
            return null;
        } else {
            JLabel moneda = depositoVisual.get(0);
            depositoVisual.remove(0);
            return moneda;
        }
    }

    public JLabel seeMonedaLabel(int i) {
        return depositoVisual.get(i);
    }

    public int getSerieOf(int i) {
        T item = depMoneda.getItem(i);
        if (item instanceof Moneda) {
            return ((Moneda) item).getSerie();
        } else {
            return -1; // Valor predeterminado si no es un objeto de tipo Producto
        }
    }
}