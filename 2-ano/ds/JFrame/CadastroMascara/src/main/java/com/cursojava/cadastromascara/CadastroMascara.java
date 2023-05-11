package com.cursojava.cadastromascara;

//@author Pedro

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class CadastroMascara extends JFrame{
    
    //criação dos objetos
    JLabel lblTitle, lblNome, lblCpf, lblRg, lblEndereco, lblBairro, lblCep, lblCidade, lblEstado, lblLogin, lblSenha, lblTelefone, lblEmail;
    JPasswordField boxSenha;
    TextField txtNome, txtEndereco, txtBairro, txtCidade, txtLogin, txtEmail;
    JFormattedTextField txtCpf, txtRg, txtCep, txtEstado, txtTelefone;
    MaskFormatter mascaraCpf, mascaraRg, mascaraCep, mascaraEstado, mascaraTelefone;
    JButton btnFechar;
    
    //criacao do método construtor para criar a interface gráfica
    public CadastroMascara(){
        super("Cadastro de Clientes"); //título da janela
        Container tela = getContentPane(); //ciação de um container com o nome "tela"
        setLayout(null); //limpar objetos da tela
        
        //atribuição de um valor ao JLabel
        lblTitle = new JLabel("Cadastro de Clientes");
        lblNome = new JLabel("Nome:");
        lblCpf = new JLabel("CPF:");
        lblRg = new JLabel("RG:");
        lblEndereco = new JLabel("Endereço:");
        lblBairro = new JLabel("Bairro:");
        lblCep = new JLabel("CEP:");
        lblCidade = new JLabel("Cidade:");
        lblEstado = new JLabel("Estado:");
        lblLogin = new JLabel("Login:");
        lblSenha = new JLabel("Senha:");
        lblTelefone = new JLabel("Telefone:");
        lblEmail = new JLabel("E-mail:");
        
        //atribuindo valor aos JButton
        btnFechar = new JButton("Fechar");
        
        //atribuindo tamanho a caixa de texto
        txtNome = new TextField(250);
        txtEndereco = new TextField(80);
        txtBairro = new TextField(50);
        txtCidade = new TextField(50);
        txtLogin = new TextField(100);
        txtEmail = new TextField(100);
        
        //atribuindo tamanho a caixa de textoJPasswordField
        boxSenha = new JPasswordField(50);
        
        //evento para encerrar o sistema
        btnFechar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        System.exit(0); //fechamento da janela
                    }
                }
        );
        
        //posicionamento dos JLabel
        //coluna, linha, largura, altura
        lblTitle.setBounds(180, 10, 300, 50);
        lblNome.setBounds(20, 60, 50, 40);
        lblCpf.setBounds(20, 105, 40, 40);
        lblRg.setBounds(270, 105, 40, 40);
        lblEndereco.setBounds(20, 150, 65, 40);
        lblBairro.setBounds(20, 195, 65, 40);
        lblCep.setBounds(400, 195, 40, 50);
        lblCidade.setBounds(20, 240, 70, 40);
        lblEstado.setBounds(400, 240, 70, 50);
        lblLogin.setBounds(20, 285, 60, 50);
        lblSenha.setBounds(20, 330, 60, 50);
        lblTelefone.setBounds(20, 375, 70, 50);
        lblEmail.setBounds(20, 420, 60, 50);
        
        
        //atribuindo a fonte, peso e tamanho aos JLabel
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
        lblRg.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
        lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCep.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCidade.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEstado.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLogin.setFont(new Font("Arial", Font.PLAIN, 14));
        lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        
        //atribuindo as máscaras
        try{
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraRg = new MaskFormatter("##.###.###-#");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraEstado = new MaskFormatter("UU");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            
            //atribuindo o placeholder (o que ficará escrito na caixa de texto)
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraRg.setPlaceholderCharacter('_');
            mascaraCep.setPlaceholderCharacter('_');
            mascaraEstado.setPlaceholderCharacter('_');
            mascaraTelefone.setPlaceholderCharacter('_');
        }catch(ParseException excp){}
        
        //colocando a mascara nos JFormattedTextField
        txtCpf = new JFormattedTextField(mascaraCpf);
        txtRg = new JFormattedTextField(mascaraRg);
        txtCep = new JFormattedTextField(mascaraCep);
        txtEstado = new JFormattedTextField(mascaraEstado);
        txtTelefone = new JFormattedTextField(mascaraTelefone);
        
        //posicionamento dos JFormattedTextField na tela
        //coluna, linha, largura, altura
        txtCpf.setBounds(90, 110, 100, 25);
        txtRg.setBounds(305, 110, 85, 25);
        txtCep.setBounds(440, 205, 70, 25);
        txtEstado.setBounds(455, 250, 30, 25);
        txtTelefone.setBounds(90, 385, 100, 25);
        
        //posicionamento dos TextField na tela
        //coluna, linha, largura, altura
        txtNome.setBounds(90, 70, 300, 25);
        txtEndereco.setBounds(90, 160, 300, 25);
        txtBairro.setBounds(90, 203, 300, 25);
        txtCidade.setBounds(90, 250, 300, 25);
        txtLogin.setBounds(90, 300, 300, 25);
        txtEmail.setBounds(90, 430, 300, 25);
        
        //posicionamento JPasswordField na tela
        //coluna, linha, largura, altura
        boxSenha.setBounds(90, 340, 300, 25);
        
         //posicionando os botoes na tela
        //coluna, linha, largura, altura
        btnFechar.setBounds(220, 480, 100, 30);
        
        //colocando os JLabel na tela
        tela.add(lblTitle);
        tela.add(lblNome);
        tela.add(lblCpf);
        tela.add(lblRg);
        tela.add(lblEndereco);
        tela.add(lblBairro);
        tela.add(lblCep);
        tela.add(lblCidade);
        tela.add(lblEstado);
        tela.add(lblLogin);
        tela.add(lblSenha);
        tela.add(lblTelefone);
        tela.add(lblEmail);
        
        //colocando os TextField na tela
        tela.add(txtNome);
        tela.add(txtEndereco);
        tela.add(txtBairro);
        tela.add(txtCidade);
        tela.add(txtLogin);
        tela.add(txtEmail);
        
        //colocando os JFormattedTextField na tela
        tela.add(txtCpf);
        tela.add(txtRg);
        tela.add(txtCep);
        tela.add(txtEstado);
        tela.add(txtTelefone);
        
        //colocando JPasswordField na tela
        tela.add(boxSenha);
        
        //colocando os botões na tela
        tela.add(btnFechar);
        
        setSize(550,600); //tamanho da tela
        setVisible(true); //tela visível
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa

    }
    
}
