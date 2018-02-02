/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Pila<T> {

    private List<T> almacen = new ArrayList<>();

    public T peek() {
        return almacen.isEmpty()
                ? null : almacen.get(almacen.size() - 1);
    }

    public void push(T dato) {
        almacen.add(dato);
    }

    public T pop() {
        if (almacen.isEmpty()) {
            return null;
        } else {
            T dato = almacen.get(almacen.size() - 1);
            almacen.remove(almacen.size() - 1);
            return dato;
        }
    }
}
