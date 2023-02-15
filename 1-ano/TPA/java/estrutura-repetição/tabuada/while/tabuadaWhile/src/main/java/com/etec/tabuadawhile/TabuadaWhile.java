/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.tabuadawhile;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class TabuadaWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int cont, x, res;
    
    public static void main(String[] args) {
        System.out.println("Digite um número de 1 à 10: ");
        x = teclado.nextInt();
        if (x>=1 && x<=10){
            cont = 0;
            while(cont <= 10)
            {
            res = x*cont;
            System.out.println(x + " x " + cont + " = " + res);
            cont++;
            }
        } else{
            System.out.println("[ERRO] Número inválido");   
        }
    }
}
