/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc5.maioridade;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Pedro
 */
public class Exerc5Maioridade {
    public static Scanner teclado = new Scanner(System.in);
    public static int anon = 0;
    public static int idade = 0;
    
    public static void main(String[] args) {
          try {
            System.out.println("Digite o ano de seu nascimento: "); 
            anon = teclado.nextInt();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o ano (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o ano (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
          
          idade = 2022-anon;
          if(idade >= 18){
              System.out.println("Já atingiu a maioridade. " + idade + " anos");
          } if(idade<18&&idade>=0){
              System.out.println("Não atingiu a maioridade. " + idade + " anos");
          } if(idade<0){
              System.out.println("Informe um ano de nascimento válido");
          }
    }
}
