/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.tratamendocadastro;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Pedro
 */
public class TratamendoCadastro {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome = "";
    public static int idade = 0;
    public static float altura;
    public static boolean paulistano;

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("| Seja bem vindo(a) ao cadastro de aluno |");
        System.out.println("------------------------------------------");
        
        try{
            System.out.println("Digite seu nome: ");
            nome = teclado.nextLine();
        }
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o nome (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o nome (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a idade (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2) {
            System.out.println("Ocorreu um erro ao armazenar a idade (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite sua altura: ");
            altura = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a altura (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2) {
            System.out.println("Ocorreu um erro ao armazenar a altura (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite se você é paulistano: [true/false]");
            paulistano = teclado.nextBoolean();
            
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar se é paulistano (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2) {
            System.out.println("Ocorreu um erro ao armazenar se é paulistano (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        
         System.out.println("--------------------------------------");
         System.out.println("Cadastro feito com sucesso");
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Altura: " + altura);
         if (paulistano == true){
                System.out.println("Paulistano: Sim"); 
            } else{
             System.out.println("Paulistano: Não");
         }
         
       
    }
}
