/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.genericos;
/**
 *
 * @author Administrador
 * @param <T>
 */
public class Cajon<T extends A>{
   private T t;
   public void set (T t){
   this.t = t;
   }
   public T get( ){
   return t;
   }
   
   @Override
   public String toString(){
       return "Este cajon contine : "+ t;
   }
   
}
