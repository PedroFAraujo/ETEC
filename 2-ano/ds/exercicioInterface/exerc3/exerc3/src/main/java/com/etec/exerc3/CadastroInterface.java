package com.etec.exerc3;

import javax.swing.*;
import java.awt.*;

//@author Pedro
 
public class CadastroInterface extends JFrame{
   JLabel titulo, nome, endereco, cidade, estado, cep, telefone;
   public CadastroInterface(){
       super("Exercicío 4");
       Container tela = getContentPane();
       tela.setBackground(Color.cyan);
       setResizable(false);
       ImageIcon icone = new ImageIcon("icon.png");
       setIconImage(icone.getImage());
        setLayout(null); //limpar objetos de tela
        titulo = new JLabel("Cadastro de Clientes");
        nome = new JLabel("Nome: ");
        endereco = new JLabel("Endereço: ");
        cidade = new JLabel("Cidade: ");
        estado = new JLabel("Estado: ");
        cep = new JLabel("CEP: ");
        telefone = new JLabel("Telefone: ");
        
        titulo.setBounds(50,15,160,30); //coluna, linha, largura, comprimento
        titulo.setForeground(Color.blue);
        titulo.setFont(new Font("Arial", Font.BOLD,13));
        tela.add(titulo);
        
        nome.setBounds(20,40,80,30); //coluna, linha, largura, comprimento
        nome.setForeground(Color.black);
        nome.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(nome);
        
        endereco.setBounds(20,65,80,30);
        endereco.setForeground(Color.black);
        endereco.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(endereco);
        
        cidade.setBounds(20,90,80,30);
        cidade.setForeground(Color.black);
        cidade.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(cidade);
        
        estado.setBounds(20,115,80,30);
        estado.setForeground(Color.black);
        estado.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(estado);
        
        cep.setBounds(20,140,80,30);
        cep.setForeground(Color.black);
        cep.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(cep);
        
        telefone.setBounds(20,165,80,30);
        telefone.setForeground(Color.black);
        telefone.setFont(new Font("Arial", Font.BOLD,12));
        tela.add(telefone);
        
        setSize(250,250);
        setVisible(true);
        setLocationRelativeTo(null);
   }
   
    public static void main(String[] args) {
        CadastroInterface app = new CadastroInterface();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
