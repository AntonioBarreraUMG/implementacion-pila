/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.prograclase12;

import pila.vector.PilaVector;
import pila.lineal.PilaLineal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pila.IPila;
import pila.arraylist.PilaArrayList;
import pila.linkedlist.PilaLista;

/**
 *
 * @author jeant
 */
public class App {

    private static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    private static final IPila pilaLista = new PilaLista();
    private static final IPila pilaLineal = new PilaLineal();
    private static final IPila pilaVector = new PilaVector();
    private static final IPila pilaArrayList = new PilaArrayList();
    
    static void ejecutarPila(IPila pila) throws IOException {
        Double valor;
        System.out.println("Ingrese cualquier numero menor a 0 para salir.\n");
        try {
            do {
                System.out.println("Ingrese un numero: ");
                valor = Double.valueOf(entrada.readLine());
                pila.insertar(valor);
                System.out.println();
            } while (valor > 0);

            System.out.println("\nElementos de la Pila: ");
            
            while (!pila.estaVacia()) {
                Double elemento;
                elemento = (Double) pila.quitar();
                if (elemento > 0.0) {
                    System.out.print(elemento + " ");
                }
            }

        } catch (NumberFormatException ex) {
            System.out.println("Entrada no valida.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    public static void main(String args[]) throws IOException {

//        ejecutarPila(pilaLista);

//        ejecutarPila(pilaLineal);

//        ejecutarPila(pilaVector);

        ejecutarPila(pilaArrayList);

    }

}
