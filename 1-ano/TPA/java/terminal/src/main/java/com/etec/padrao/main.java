
package com.etec.padrao;

import java.util.Scanner;

public class main {
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome = "";
    public static int idade = 0;
    public static float altura;
    public static boolean paulistano;
    
    public static void main(String[] args)
    {
        System.out.println("------------------------------------------");
        System.out.println("| Seja bem vindo(a) ao cadastro de aluno |");
        System.out.println("------------------------------------------");
        
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("Digite se você é paulistano [true/false]");
        paulistano = teclado.nextBoolean();
        
        System.out.println("Você nasceu na capital");
        
         System.out.println("--------------------------------------");
         System.out.println("Cadastro feito com sucesso");
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Altura: " + altura);
         System.out.println("Paulistano: " + paulistano);
    }
}
