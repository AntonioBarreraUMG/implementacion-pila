/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila.linkedlist;

import pila.IPila;

/**
 *
 * @author jeant
 */
public class PilaLista implements IPila {

    private NodoPila cima;

    public PilaLista() {
        cima = null;
    }

    @Override
    public void insertar(Object elemento) {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    @Override
    public Object quitar() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    @Override
    public Object obtener() throws Exception {
        if (estaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return cima.elemento;
    }

    @Override
    public void limpiar() throws Exception {
        NodoPila t;
        while (!estaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }

    @Override
    public boolean estaVacia() {
        return cima == null;
    }

}
