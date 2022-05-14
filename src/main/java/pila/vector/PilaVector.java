/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila.vector;

import java.util.Vector;
import pila.IPila;

/**
 *
 * @author jeant
 */
public class PilaVector implements IPila {

    private int cima;
    private Vector listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector();
    }

    @Override
    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement(elemento);
    }

    @Override
    public Object quitar() throws Exception {
        Object aux;
        if (estaVacia()) {
            throw new Exception("Pila Vacia");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    @Override
    public Object obtener() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila vacia");
        }

        return listaPila.elementAt(cima);
    }

    @Override
    public void limpiar() throws Exception {
        while (!estaVacia()) {
            quitar();
        }
    }

    @Override
    public boolean estaVacia() {
        return cima == -1;
    }

}
