package com.cursojava.cadastroprofessor;

//@author Pedro

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Util extends JFrame {
    //criação de objetos
    JLabel lblTitle, lblNome, lblMatricula, lblDisciplina, lblQntAula;
    TextField txtNome, txtMatricula, txtDisciplina, txtQntAula;
    JButton btnConfirmar;
    
    //criacao do método construtor para criar a interface gráfica
    public Util(){
        super("Cadastro de Professor"); //título da janela
        Container tela = getContentPane(); //criação de um container com o nome "tela";
        setLayout(null); //limpando objetos da tela
        
        //atribuição de um valor ao JLabel
        lblTitle = new JLabel("Cadastro de Professor");
        lblNome = new JLabel("Nome:");
        lblMatricula = new JLabel("Matrícula:");
        lblDisciplina = new JLabel("Disciplina:");
        lblQntAula = new JLabel("Quantidade de aulas:");
        
        //atribuição de um valor ao JButton
        btnConfirmar = new JButton("Confirmar Cadastro");
        
        //atribuindo tamanho a uma caixa de texto
        txtNome = new TextField(250);
        txtMatricula = new TextField(20);
        txtDisciplina = new TextField(50);
        txtQntAula = new TextField(3);
        
        //posicionamento dos JLabel
        //coluna, linha, largura, altura
        lblTitle.setBounds(20, 10, 300, 50);
        lblNome.setBounds(20, 60, 50, 40);
        lblMatricula.setBounds(20, 105, 70, 40);
        lblDisciplina.setBounds(20, 150, 70, 40);
        lblQntAula.setBounds(20, 195, 140, 40);
        
        //atribuindo a fonte, peso e tamanho aos JLabel
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMatricula.setFont(new Font("Arial", Font.PLAIN, 14));
        lblDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
        lblQntAula.setFont(new Font("Arial", Font.PLAIN, 14));
        
        //posicionamento dos TextField na tela
        //coluna, linha, largura, altura
        txtNome.setBounds(90, 70, 180, 25);
        txtMatricula.setBounds(90, 115, 60, 25);
        txtDisciplina.setBounds(90, 160, 180, 25);
        txtQntAula.setBounds(160, 205, 60, 25);
        
        //posicionamento do JButton na tela
        btnConfirmar.setBounds(140, 250, 150, 25);
        
        //evento para encerrar o sistema
        btnConfirmar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        String nomeAction, matriculaAction, disciplinaAction, qntAulaAction; //criação de variáveis
                        
                        //atribui o input da String dos JFormattedTextField para as variáveis
                        nomeAction = (txtNome.getText());
                        matriculaAction = (txtMatricula.getText());
                        disciplinaAction = (txtDisciplina.getText());
                        qntAulaAction = (txtQntAula.getText());
                        
                        JOptionPane.showMessageDialog(null, "Nome: " + nomeAction + "\n\nMatrícula: " + matriculaAction + "\n\nDisciplina: " + disciplinaAction + "\n\nQuantidade de Aulas: " + qntAulaAction );
                    }
                }
        );
        
        //colocando os JLabel na tela
        tela.add(lblTitle);
        tela.add(lblNome);
        tela.add(lblMatricula);
        tela.add(lblDisciplina);
        tela.add(lblQntAula);
        
        //colocando os TextField na tela
        tela.add(txtNome);
        tela.add(txtMatricula);
        tela.add(txtDisciplina);
        tela.add(txtQntAula);
        
        //colocando JButton na tela
        tela.add(btnConfirmar);
        
        setSize(450,350); //tamanho da tela
        setVisible(true); //tela visível
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa
    }
}
