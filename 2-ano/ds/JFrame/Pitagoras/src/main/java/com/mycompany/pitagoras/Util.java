package com.mycompany.pitagoras;

//@author Pedro

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Util extends JFrame {
    //criação de objetos
    JLabel lblTitle, lblN1, lblN2;
    TextField txtN1, txtN2;
    JButton btnConfirmar;
    
    //criacao do método construtor para criar a interface gráfica
    public Util(){
        super("Calculo da Media"); //título da janela
        Container tela = getContentPane(); //criação de um container com o nome "tela";
        setLayout(null); //limpando objetos da tela
        
        //atribuição de um valor ao JLabel
        lblTitle = new JLabel("Calculo de Pitágoras");
        lblN1 = new JLabel("Cateto 1:");
        lblN2 = new JLabel("Cateto 2:");
        
        //atribuição de um valor ao JButton
        btnConfirmar = new JButton("Calcular Pitágoras");
        
        //atribuindo tamanho a uma caixa de texto
        txtN1 = new TextField(2);
        txtN2 = new TextField(2);
        
        //posicionamento dos JLabel
        //coluna, linha, largura, altura
        lblTitle.setBounds(75, 10, 300, 50);
        lblN1.setBounds(20, 60, 60, 40);
        lblN2.setBounds(20, 105, 60, 40);
        
        //atribuindo a fonte, peso e tamanho aos JLabel
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblN1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblN2.setFont(new Font("Arial", Font.PLAIN, 14));
        
        //posicionamento dos TextField na tela
        //coluna, linha, largura, altura
        txtN1.setBounds(90, 70, 50, 25);
        txtN2.setBounds(90, 115, 50, 25);
        
        //posicionamento do JButton na tela
        btnConfirmar.setBounds(90, 160, 150, 25);
        
        //evento para encerrar o sistema
        btnConfirmar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        double n1, n2, hipotenusa; //criação de variáveis
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        n1 = Integer.parseInt(txtN1.getText());
                        n2 = Integer.parseInt(txtN2.getText());
                        
                        hipotenusa = Math.sqrt(Math.pow(n1,2)+Math.pow(n2,2)); //efetua a operação
                        
                        JOptionPane.showMessageDialog(null, "Hipotenusa = " + hipotenusa);
                }
            }
        );
        
        //colocando os JLabel na tela
        tela.add(lblTitle);
        tela.add(lblN1);
        tela.add(lblN2);
        
        //colocando os TextField na tela
        tela.add(txtN1);
        tela.add(txtN2);
        
        //colocando JButton na tela
        tela.add(btnConfirmar);
        
        setSize(350,350); //tamanho da tela
        setVisible(true); //tela visível
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa
    }
}
