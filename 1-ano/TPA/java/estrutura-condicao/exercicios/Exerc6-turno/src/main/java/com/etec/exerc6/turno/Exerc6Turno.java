
package com.etec.exerc6.turno;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Exerc6Turno {
    public static Scanner teclado = new Scanner(System.in);
    public static float turno = 0;        
    
    public static void main(String[] args) {
        try {
            System.out.println("Digite o horário do inicio do turno de seu trabalho: "); 
            turno = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o horário (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o horário (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        if(turno >=5 && turno <=12.59){
            System.out.println("Turno matutino");
        } if (turno >= 13 && turno<=20.59){
            System.out.println("Turno vespertino");
        }
        if (turno >=21 || turno<=4.59){
            System.out.println("Turno Noturno");
        } else{
            System.out.println("Horário Inválido");
        }
    }
}
