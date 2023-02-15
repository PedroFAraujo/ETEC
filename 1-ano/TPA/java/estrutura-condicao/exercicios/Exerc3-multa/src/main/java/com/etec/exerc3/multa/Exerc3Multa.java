/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc3.multa;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Pedro
 */
public class Exerc3Multa {
    public static float kg;
    public static float multa;
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            System.out.println("Digite a quantidade em quilo da pesca: "); 
            kg = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a quantidade de kg (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar  a quantidade de kg (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        if (kg > 50){
            multa = ((kg-50)*4);
            System.out.println("Multa paga será de R$" + multa);
        } else{
            System.out.println("Não há multa a ser paga");
        }
    }
}
