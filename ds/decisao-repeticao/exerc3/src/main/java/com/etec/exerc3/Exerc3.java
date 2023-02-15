/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc3;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exerc3 {
    
    public static float num;
    public static int cont;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 15 valores: ");
        cont = 0;
        for (int i = 1; i<=15; i++ ){
            num = teclado.nextFloat();
            if (num > 30){
                cont = cont + 1;
            }
        }
        System.out.println("Números digitados maiores do que 30: " + cont);
    }
    
}
