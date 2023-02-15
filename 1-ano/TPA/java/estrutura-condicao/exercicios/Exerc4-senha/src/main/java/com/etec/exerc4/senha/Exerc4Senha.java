
package com.etec.exerc4.senha;
import java.util.Scanner;

public class Exerc4Senha {
    public static Scanner teclado = new Scanner(System.in);
    public static String senha = "";
    
    public static void main(String[] args) {
            System.out.println("Digite a senha: "); 
            senha = teclado.nextLine();
        
        if( "carpediem".equals(senha)){
            System.out.println("Senha válida");
        } else{
            System.out.println("Senha inválida");
        }
    }
}
