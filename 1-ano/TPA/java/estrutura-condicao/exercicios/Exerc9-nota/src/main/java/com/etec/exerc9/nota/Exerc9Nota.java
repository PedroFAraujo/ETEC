
package com.etec.exerc9.nota;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exerc9Nota {
    public static Scanner teclado = new Scanner(System.in);
    public static float n1;
    public static float n2;
    public static float n3;
    public static float n4;
    public static float media;
    
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("       Aprovação alunos        ");
        System.out.println("-------------------------------");
        
        try {
            System.out.println("Digite a nota do primeiro bimestre: "); 
            n1 = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a primeira nota (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a primeira nota (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite a nota do segundo bimestre: "); 
            n2 = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a segunda nota (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a segunda nota (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite a nota do terceiro bimestre: "); 
            n3 = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a terceira nota (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a terceira nota (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite a nota do quarto bimestre: "); 
            n4 = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a quarta nota (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a quarta nota (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        media = ((n1+n2+n3+n4)/4);
        System.out.println("----------------------------");
        if(media >= 9){
            System.out.println("Aprovado - A");
            System.out.println("Media = " + media);
        } if(media >=7 && media<9){
            System.out.println("Aprovado - B");
            System.out.println("Media = " + media);
        } if(media >=5 && media<7){
            System.out.println("Aprovado - C");
            System.out.println("Media = " + media);
        } if(media>=2.5 && media<5){
            System.out.println("Reprovado - D");
            System.out.println("Media = " + media);
        } if(media < 2.5){
            System.out.println("Reprovado - E");
            System.out.println("Media = " + media);
        }
        
    }
}
