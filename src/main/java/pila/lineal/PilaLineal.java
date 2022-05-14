/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila.lineal;

import pila.IPila;

/**
 *
 * @author jeant
 */
public class PilaLineal implements IPila {

    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila;

    public PilaLineal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

    @Override
    public void insertar(Object elemento) throws Exception {
        if (estaLlena()) {
            throw new Exception("StackOverFlow");
        }

        cima++;

        listaPila[cima] = elemento;
    }

    @Override
    public Object quitar() throws Exception {
        Double aux;

        if (estaVacia()) {
            throw new Exception("UnderFlox");
        }

        aux = (Double) listaPila[cima];

        cima--;

        return aux;
    }

    @Override
    public Object obtener() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila vacia");
        }

        return listaPila[cima];
    }

    @Override
    public void limpiar() throws Exception {
        cima = -1;
    }

    @Override
    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == TAMPILA - 1;
    }

}
