/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primospruebaback;

/**
 *
 * @author steven Garcia
 */
public class PrimosPruebaBack {

    public static void main(String[] args) {
        counterPrimo();
    }
    
    //se toma desde el dos dado que se cogre entiendo que el 1 es primo
    public static void counterPrimo (){
    for (int i = 2; i <= 21; i++){
    boolean isNotPrimo = (i % 2 == 0);
    if (!isNotPrimo){
        System.out.println(i);
    }
    }
  }
}
