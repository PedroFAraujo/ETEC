
package com.mycompany.cadastrocliente;

import javax.swing.*;
import java.awt.*;

//@author Pedro

public class Main extends JFrame {
     JLabel title, nome, cpf, rg, endereco, cidade, estado, cep;
    TextField txtNome, txtCpf, txtRg, txtEndereco, txtCidade, txtEstado, txtCep;
    
    public Main(){
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
        
        //atribuindo quantidade caractere TextField
        txtNome = new TextField(50);
        txtCpf = new TextField(11);
        txtRg = new TextField(7);
        txtEndereco = new TextField(50);
        txtCidade = new TextField(50);
        txtEstado = new TextField(30);
        txtCep = new TextField(8);
        
        //posicionando os JLabel na tela e declarando sua largura e altura
        title.setBounds(50,0,200,20); //coluna, linha, largura, altura
        nome.setBounds(50,20,40,20); 
        cpf.setBounds(50,60,40,20);
        rg.setBounds(50,100,80,20);
        endereco.setBounds(50,140,80,20);
        cidade.setBounds(50,60,40,20);
        estado.setBounds(50,100,80,20);
        cep.setBounds(50,140,80,20);
        
        //posicionamento dos TextField
        txtNome.setBounds(150,20,150,20);
        txtCpf.setBounds(150,60,150,20);
        txtRg.setBounds(150,100,150,20);
        txtEndereco.setBounds(150,140,150,20);
        txtCidade.setBounds(150,60,150,20);
        txtEstado.setBounds(150,100,150,20);
        txtCep.setBounds(150,140,150,20);
        
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
        
        setSize(400,600); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela fixa
    }
    
    public static void main(String[] args) {
        Main app = new Main(); //instancia do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opções da janela
        
    }
}
