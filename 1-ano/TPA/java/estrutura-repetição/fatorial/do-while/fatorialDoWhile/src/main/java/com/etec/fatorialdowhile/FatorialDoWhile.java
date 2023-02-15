/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.fatorialdowhile;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class FatorialDoWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int cont, x, y;
    
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        x = teclado.nextInt();
        y = x;
        cont = x-1;
        do
        {
            x = x*cont;
            cont--;
        }
        while(cont>=1);
        System.out.println(y + "! = " + x);
    }
}
