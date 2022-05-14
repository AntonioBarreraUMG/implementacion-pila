/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila.arraylist;

import java.util.ArrayList;
import java.util.List;
import pila.IPila;

/**
 *
 * @author jeant
 */
public class PilaArrayList implements IPila {

    private int cima;
    private final List<Object> lista;

    public PilaArrayList() {
        cima = -1;
        lista = new ArrayList<>();
    }

    @Override
    public void insertar(Object elemento) throws Exception {
        cima++;
        lista.add(elemento);
    }

    @Override
    public Object quitar() throws Exception {
        Object aux;
        if (lista.isEmpty()) {
            throw new Exception("Pila vacia.");
        }
        aux = lista.get(cima);
        lista.remove(cima);
        cima--;
        return aux;
    }

    @Override
    public Object obtener() throws Exception {
        if (lista.isEmpty()) {
            throw new Exception("Pila vacia.");
        }
        return lista.get(cima);
    }

    @Override
    public void limpiar() throws Exception {
        if (lista.isEmpty()) {
            throw new Exception("Pila vacia.");
        }
        while (!estaVacia()) {
            quitar();
        }
    }

    @Override
    public boolean estaVacia() throws Exception {
        return cima == -1;
    }

}
