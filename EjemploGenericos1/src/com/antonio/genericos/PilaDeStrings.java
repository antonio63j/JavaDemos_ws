/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.genericos;

/**
 *
 * @author jose maria
 */
public class PilaDeStrings {

    private String[] almacen;
    private Integer indice = 0;

    public PilaDeStrings(Integer numeroMaximoDeDatos) {
        this.almacen = new String[numeroMaximoDeDatos];
    }

    public String peek() {
        return indice == 0 ? null : almacen[indice];
    }

    public void push(String dato) {
        if (indice == almacen.length) {
            throw new RuntimeException("No hay sitio");
        } else {
            almacen[indice++] = dato;
        }
    }

    public String pop() {
        return indice == 0 ? null : almacen[indice--];
    }
}
