package com.mycompany.medianota;

//@author Pedro

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Util extends JFrame {
    //criação de objetos
    JLabel lblTitle, lblN1, lblN2, lblN3, lblN4;
    TextField txtN1, txtN2, txtN3, txtN4;
    JButton btnConfirmar;
    
    //criacao do método construtor para criar a interface gráfica
    public Util(){
        super("Calculo da Media"); //título da janela
        Container tela = getContentPane(); //criação de um container com o nome "tela";
        setLayout(null); //limpando objetos da tela
        
        //atribuição de um valor ao JLabel
        lblTitle = new JLabel("Calculo da Média");
        lblN1 = new JLabel("Nota 1:");
        lblN2 = new JLabel("Nota 2:");
        lblN3 = new JLabel("Nota 3:");
        lblN4 = new JLabel("Nota 4:");
        
        //atribuição de um valor ao JButton
        btnConfirmar = new JButton("Calcular Média");
        
        //atribuindo tamanho a uma caixa de texto
        txtN1 = new TextField(2);
        txtN2 = new TextField(2);
        txtN3 = new TextField(2);
        txtN4 = new TextField(2);
        
        //posicionamento dos JLabel
        //coluna, linha, largura, altura
        lblTitle.setBounds(90, 10, 300, 50);
        lblN1.setBounds(20, 60, 50, 40);
        lblN2.setBounds(20, 105, 50, 40);
        lblN3.setBounds(20, 150, 50, 40);
        lblN4.setBounds(20, 195, 50, 40);
        
        //atribuindo a fonte, peso e tamanho aos JLabel
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblN1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblN2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblN3.setFont(new Font("Arial", Font.PLAIN, 14));
        lblN4.setFont(new Font("Arial", Font.PLAIN, 14));
        
        //posicionamento dos TextField na tela
        //coluna, linha, largura, altura
        txtN1.setBounds(70, 70, 30, 25);
        txtN2.setBounds(70, 115, 30, 25);
        txtN3.setBounds(70, 160, 30, 25);
        txtN4.setBounds(70, 205, 30, 25);
        
        //posicionamento do JButton na tela
        btnConfirmar.setBounds(90, 250, 150, 25);
        
        //evento para encerrar o sistema
        btnConfirmar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        float n1, n2, n3, n4, media; //criação de variáveis
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        n1 = Integer.parseInt(txtN1.getText());
                        n2 = Integer.parseInt(txtN2.getText());
                        n3 = Integer.parseInt(txtN3.getText());
                        n4 = Integer.parseInt(txtN4.getText());
                        
                        media = (n1+n2+n3+n4)/4; //efetua a operação
                        
                        JOptionPane.showMessageDialog(null, "A média é " + media);
                }
            }
        );
        
        //colocando os JLabel na tela
        tela.add(lblTitle);
        tela.add(lblN1);
        tela.add(lblN2);
        tela.add(lblN3);
        tela.add(lblN4);
        
        //colocando os TextField na tela
        tela.add(txtN1);
        tela.add(txtN2);
        tela.add(txtN3);
        tela.add(txtN4);
        
        //colocando JButton na tela
        tela.add(btnConfirmar);
        
        setSize(350,350); //tamanho da tela
        setVisible(true); //tela visível
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa
    }
}
