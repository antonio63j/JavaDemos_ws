/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.genericos;

/**
 *
 * @author jose maria
 */
public class PilaDeEnteros {

    private Integer[] almacen;
    private Integer indice = 0;

    public PilaDeEnteros(Integer numeroMaximoDeDatos) {
        this.almacen = new Integer[numeroMaximoDeDatos];
    }

    public Integer peek() {
        return indice == 0 ? null : almacen[indice];
    }

    public void push(Integer dato) {
        if (indice == almacen.length) {
            throw new RuntimeException("No hay sitio");
        } else {
            almacen[indice++] = dato;
        }
    }

    public Integer pop() {
        return indice == 0 ? null : almacen[indice--];
    }
}
