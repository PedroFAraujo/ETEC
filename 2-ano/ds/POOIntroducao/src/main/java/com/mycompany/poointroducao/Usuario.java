/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poointroducao;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Usuario {

    //Atributos
    String nome;
    String email;
    String login;
    String senha;
    
    //Construtores
    //Inicializa os atributos vazios
    public Usuario(String nome, String email, String login, String senha){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(){
    this("", "", "", "");
    }
    
    //Getters e Setters

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Métodos específicos da classe
    public void provarExistencia(){
        System.out.println("Oi, eu existo!");
    }
    
    public void exibirinfo(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nLogin: " + this.getLogin() + "\nSenha: " + this.getSenha());
    }
}
