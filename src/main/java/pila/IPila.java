/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author jeant
 */
public interface IPila {

    void insertar(Object elemento) throws Exception;

    Object quitar() throws Exception;

    Object obtener() throws Exception;

    void limpiar() throws Exception;

    boolean estaVacia() throws Exception;
}
