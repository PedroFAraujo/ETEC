/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poointroducao;

/**
 *
 * @author dti
 */
public class Main {
    
    public static void main(String[] args) {
       Usuario usuario1 = new Usuario("Pedro", "pedro@gmail.com", "PedroFAraujo", "Senha321");
        usuario1.provarExistencia();
        usuario1.exibirinfo();
        
    }
    
}
