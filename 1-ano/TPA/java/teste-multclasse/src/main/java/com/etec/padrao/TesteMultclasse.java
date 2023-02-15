/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.padrao;

/**
 *
 * @author User
 */
public class TesteMultclasse {

    public static void main(String[] args) {
        //Carrega na memória o objeto da classe util
        nome cadastro = new nome();
        Idade cadastro2 = new Idade(); 
        
        //Executa o método solicitado
        cadastro.digitarTexto();
        
        //Executa o método solicitado
        cadastro.exibirTexto();
        
        //Executa o método solicitado
        cadastro2.digitarIdade();
        
        //Executa o método solicitado
        cadastro2.exibirIdade();
        
        
    }
}
