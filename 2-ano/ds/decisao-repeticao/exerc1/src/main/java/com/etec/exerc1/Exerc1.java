/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc1;

/**
 *
 * @author Pedro
 */
public class Exerc1 {
    
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 75 e 197: ");
        for (int i = 75; i <= 197; i++ ){
            if (i % 2 > 0){
                System.out.println(i);
            }
        }
    }
    
}
