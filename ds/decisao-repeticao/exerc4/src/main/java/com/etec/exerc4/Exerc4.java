/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exerc4 {
    
    public static float num;
    public static int cont, i;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        i = 1;
        cont = 0;
        System.out.println("Digite 10 valores: ");
        do {
            num = teclado.nextFloat();
            if (num >= 100 && num<= 200){
            cont = cont + 1;
            } if (num == 0){
                System.out.println("Programa concluído com êxito.");
                System.exit(0);
            } else {
            }
            i++;
        } 
        while (i <= 10);
        System.out.println("Quantidade de números digitados que estão entre 100 e 200: " +  cont);
    }
    
}
