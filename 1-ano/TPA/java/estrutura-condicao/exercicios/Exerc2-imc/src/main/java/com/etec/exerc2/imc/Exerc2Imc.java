/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.exerc2.imc;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Pedro
 */
public class Exerc2Imc {
    public static Scanner teclado = new Scanner(System.in);
    public static float altura;
    public static float peso;
    public static float imc;
    
    public static void main(String[] args) {
        try {
            System.out.println("Digite sua altura: "); 
            altura = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar a altura (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar a altura (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        try {
            System.out.println("Digite seu peso: "); 
            peso = teclado.nextFloat();
        } 
        catch (InputMismatchException e1) {
            System.out.println("Ocorreu um erro ao armazenar o peso (tipo de dado) " + e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Ocorreu um erro ao armazenar o peso (variável nula) " + e2.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        
        imc = peso/(altura*altura);
        
        System.out.println("----------------------------------");
        System.out.println("            RESULTADO             ");
        System.out.println("----------------------------------");
        if (imc < 18.5){
            System.out.println("Abaixo do Peso");
        } if (imc > 18.5 && imc <=24.9 ){
            System.out.println("Peso Normal");
        } if (imc > 24.9 && imc <=29.9){
            System.out.println("Sobrepeso");
        } if (imc > 29.9 && imc <=34.9){
            System.out.println("Obesidade Grau I");
        } if (imc > 34.9 && imc <=39.9) {
            System.out.println("Obesidade Grau II");
        } if (imc >=40){
            System.out.println("Obesidade Grau III ou Mórbida");
        }
    }
}
