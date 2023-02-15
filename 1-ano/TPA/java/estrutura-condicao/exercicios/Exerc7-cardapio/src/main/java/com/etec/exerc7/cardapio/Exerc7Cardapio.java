
package com.etec.exerc7.cardapio;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exerc7Cardapio {
    public static Scanner teclado = new Scanner(System.in);
    public static int opcao = 0; 
    
    
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("                  MENU                 ");
        System.out.println("---------------------------------------");
        System.out.println("[1] BicMac");
        System.out.println("[2] Quarteirão");
        System.out.println("[3] McChicken");
        System.out.println("[4] Cheddar McMelt");
        System.out.println("[5] McMax");
        System.out.println("[6] Sair");
        
        try {
            System.out.println("Digite a opção desejada: "); 
            opcao = teclado.nextInt();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a opção (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a opção (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        System.out.println("---------------------------------------");
        
        switch(opcao){
            case 1 -> { 
                System.out.println("BigMac está sendo preparado.");
            }
            case 2 -> {
                System.out.println("Quarteirão está sendo preparado");
            }
            case 3 -> {
                System.out.println("McChicken está sendo preparado");
            }
            case 4 -> {
                System.out.println("Cheddar McMelt está sendo preparado");
            }
            case 5 -> {
                System.out.println("McMax está sendo preparado");
            }
            case 6 -> {
                System.out.println("Volte sempre!");
                System.exit(0);
            }
            default -> {
                System.out.println("Opção inválida");
            }
                
        }
    }
}
