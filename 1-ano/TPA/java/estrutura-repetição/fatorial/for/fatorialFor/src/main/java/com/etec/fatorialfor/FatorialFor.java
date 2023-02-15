/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.fatorialfor;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class FatorialFor {
     public static int cont, x, y;
     public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        x = teclado.nextInt();
        y = x;
        for (cont =x-1; cont>=1; cont--)
        {
            x = x*cont;   
        }
        System.out.println(y + "! = " + x);
    }
}
