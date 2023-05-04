package com.mycompany.cadastrocliente;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.text.*;

//@author Pedro

public class Util extends JFrame {
    JLabel title, nome, cpf, rg, endereco, cidade, estado, cep, telefone, data;
    JFormattedTextField txtNome, txtCpf, txtRg, txtEndereco, txtCidade, txtEstado, txtCep;
    MaskFormatter mascaraNome, mascaraCPF, mascaraRg, mascaraEndereco, mascaraCidade, mascaraEstado, mascaraCep, mascaraTelefone, mascaraData; 
    
    public Util(){
        super("Cadastro"); //nome da janela
        Container tela = getContentPane(); //criação do container
        setLayout(null); //limpar objetos da tela
        
        //atribuindo um valor ao JLabel
        title = new JLabel("Cadastro de Cliente");
        nome = new JLabel("Nome"); 
        cpf = new JLabel("CPF"); 
        rg = new JLabel("RG");
        endereco = new JLabel("Endereço");
        cidade = new JLabel("Cidade"); 
        estado = new JLabel("Estado"); 
        cep = new JLabel("CEP");
        telefone = new JLabel("Telefone"); 
        data = new JLabel("Data"); 
        
        //posicionando os JLabel na tela e declarando sua largura e altura
        title.setBounds(110,10,200,20); //coluna, linha, largura, altura
        nome.setBounds(50,40,40,20); 
        cpf.setBounds(50,90,40,20);
        rg.setBounds(50,140,80,20);
        endereco.setBounds(50,190,80,20);
        cidade.setBounds(50,240,60,20);
        estado.setBounds(50,290,80,20);
        cep.setBounds(50,340,80,20);
        
        //posicionamento dos TextField
        txtNome.setBounds(50,60,250,20);
        txtCpf.setBounds(50,110,250,20);
        txtRg.setBounds(50,160,250,20);
        txtEndereco.setBounds(50,210,250,20);
        txtCidade.setBounds(50,260,250,20);
        txtEstado.setBounds(50,310,250,20);
        txtCep.setBounds(50,360,250,20);
        
        //foco no TextField
        txtNome.requestFocus();
        
        //atribuindo a cor dos JLabel
        title.setForeground(Color.red);
        nome.setForeground(Color.black);
        cpf.setForeground(Color.black);
        rg.setForeground(Color.black);
        endereco.setForeground(Color.black);
        cidade.setForeground(Color.black);
        estado.setForeground(Color.black);
        cep.setForeground(Color.black);
        
        //atribuindo a fonte, peso e tamanho
        title.setFont(new Font("Arial", Font.BOLD, 16));
        nome.setFont(new Font("Arial", Font.BOLD, 14));
        cpf.setFont(new Font("Arial", Font.BOLD, 14));
        rg.setFont(new Font("Arial", Font.BOLD, 14));
        endereco.setFont(new Font("Arial", Font.BOLD, 14));
        cidade.setFont(new Font("Arial", Font.BOLD, 14));
        estado.setFont(new Font("Arial", Font.BOLD, 14));
        cep.setFont(new Font("Arial", Font.BOLD, 14));
        
        //adicionando os JLabel na tela
        tela.add(title);
        tela.add(nome);
        tela.add(cpf);
        tela.add(rg);
        tela.add(endereco);
        tela.add(cidade);
        tela.add(estado);
        tela.add(cep);

        //adicionando os TextField na tela
        tela.add(txtNome);
        tela.add(txtCpf);
        tela.add(txtRg);
        tela.add(txtEndereco);
        tela.add(txtCidade);
        tela.add(txtEstado);
        tela.add(txtCep);
        
        //cor na janela
        tela.setBackground(new Color(216, 212, 196));
        
        setSize(400,600); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela fixa
    }
    
}
