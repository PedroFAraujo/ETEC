
package com.etec.exerc8.mes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exerc8Mes {
    public static Scanner teclado = new Scanner(System.in);
    public static int mes = 0;
    
    public static void main(String[] args) {
        try {
            System.out.println("Digite um número de 1 à 12: "); 
            mes = teclado.nextInt();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o número (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o número (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("    Mês correspondente ao número " + mes    );
        System.out.println("-----------------------------------------");
        
        switch(mes){
            case 1 -> {
                System.out.println("Janeiro");
            }
            case 2 -> {
                System.out.println("Fevereiro");
            }
            case 3 -> {
                System.out.println("Março");
            }
            case 4 -> {
                System.out.println("Abril");
            }
            case 5 -> {
                System.out.println("Maio");
            }
            case 6 -> {
                System.out.println("Junho");
            }
            case 7 -> {
                System.out.println("Julho");
            }
            case 8 -> {
                System.out.println("Agosto");
            }
            case 9 -> {
                System.out.println("Setembro");
            }
            case 10 -> {
                System.out.println("Outubro");
            }
            case 11 -> {
                System.out.println("Novembro");
            }
            case 12 -> {
                System.out.println("Dezembro");
            }
            default -> {
                System.out.println("Opção inválida");
            }
        }
    }
}
