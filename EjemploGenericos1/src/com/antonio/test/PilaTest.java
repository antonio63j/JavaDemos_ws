/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.antonio.genericos.Pila;
/**
 *
 * @author Administrador
 */
public class PilaTest {

    public PilaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("En setUpClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("En tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("En setUp");
    }

    @After
    public void tearDown() {
        System.out.println("En tearDown");
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Integer dato = 7;
        Pila<Integer> instance = new Pila<>();
        instance.push(dato);
        assertEquals(instance.peek(), dato);
        assertEquals(instance.pop(), dato);
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila<String> instance = new Pila<>();
        String result = instance.pop();
        assertEquals(null, result);
    }
}
