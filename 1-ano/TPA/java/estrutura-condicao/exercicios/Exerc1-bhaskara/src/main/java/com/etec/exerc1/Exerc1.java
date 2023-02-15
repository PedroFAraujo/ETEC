
package com.etec.exerc1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exerc1 {
    public static Scanner teclado = new Scanner(System.in);
    public static float a = 0;
    public static float b = 0;
    public static float c = 0;
    public static float delta;
    public static float x1;
    public static float x2;
   
    public static void main(String[] args) {
        
        try {
            System.out.println("Digite o valor de A: "); 
            a = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o valor de A (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o valor de A (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite o valor de B: "); 
            b = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o valor de B (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o valor de B (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite o valor de C: "); 
            c = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o valor de C (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o valor de C (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        System.out.println("--------------------------");
        System.out.println("        RESULTADOS        ");
        System.out.println("--------------------------");
        
        delta = ((b*b) -4*a*c);
        System.out.println("Delta = " + delta);
        
        if (delta < 0){
            System.out.println("A equação " + b + "² -4×" + a + "×" + c + " não há raízes reais" );
        } if (delta == 0){
            x1 = (float) (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Raíz = " + x1);
        } else{
            x1 = (float) (-b + Math.sqrt(delta))/(2*a);
            System.out.println("X1 = " + x1);
            x2 = (float) (-b - Math.sqrt(delta))/(2*a);
            System.out.println("X2 = " + x2);
        }
        
       
    }
}
