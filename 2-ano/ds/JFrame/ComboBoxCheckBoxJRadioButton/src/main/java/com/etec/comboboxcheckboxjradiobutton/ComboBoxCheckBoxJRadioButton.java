package com.etec.comboboxcheckboxjradiobutton;

//@author Pedro

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxCheckBoxJRadioButton extends JFrame {
    //criação dos objetos
    JLabel lblCor, lblEstilo, lblTamanho, lblTitle;
    JCheckBox negrito, italico, regular, negritoItalico;
    JRadioButton tamanho12, tamanho16, tamanho20, tamanho24;
    ButtonGroup grupo;
    String cor[] = {"Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    JComboBox lista;
    Integer estilo, tamanhoFonte;
    
    //método construtor
    public ComboBoxCheckBoxJRadioButton(){
        super("ComboBoxCheckBoxJRadioButton"); //titulo da janela
        Container tela = getContentPane(); //criacao do container tela
        setLayout(null);
        
        //atribuicao de conteudo para os JLabel
        lblCor = new JLabel("Cor");
        lblEstilo = new JLabel("Estilo");
        lblTamanho = new JLabel("Tamanho");
        lblTitle = new JLabel("Programa feito em Java");
        
        lista = new JComboBox(cor);
        lista.setMaximumRowCount(7);
        
        //atribuicao de conteudo para os JCheckBox
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Itálico");
        regular = new JCheckBox("Regular");
        negritoItalico = new JCheckBox("Negrito/Itálico");
        
        //atribuicao de conteudo para os JRadioButton
        tamanho12 = new JRadioButton("12");
        tamanho16 = new JRadioButton("16");
        tamanho20 = new JRadioButton("20");
        tamanho24 = new JRadioButton("24");
        
        grupo = new ButtonGroup(); //instancia do objeto
        //adicionando os JRadioButton ao ButtonGroup "grupo"
        grupo.add(tamanho12);
        grupo.add(tamanho16);
        grupo.add(tamanho20);
        grupo.add(tamanho24);
        
        //posicionando os objetos na janela
        lblCor.setBounds(40,20,70,20);
        lblEstilo.setBounds(230,20,70,20);
        lblTamanho.setBounds(350,20,70,20);
        lblTitle.setBounds(140,150,300,50);
        lista.setBounds(40,50,150,20);
        negrito.setBounds(230,50,100,20);
        italico.setBounds(230,70,100,20);
        regular.setBounds(230,90,100,20);
        negritoItalico.setBounds(230,110,120,20);
        tamanho12.setBounds(350,50,100,20);
        tamanho16.setBounds(350,70,100,20);
        tamanho20.setBounds(350,90,100,20);
        tamanho24.setBounds(350,110,100,20);
        
        tamanhoFonte = 12;
        estilo = Font.PLAIN;
        
        //evento para colocar cor na JLabel "lblTitle"
        lista.addActionListener((ActionEvent e) -> {
            if("Sem Cor".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.black);
            if("Vermelho".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.red);
            if("Azul".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.blue);
            if("Verde".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.green);
            if("Amarelo".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.yellow);
            if("Branco".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.white);
            if("Preto".equals(lista.getSelectedItem().toString()))
                lblTitle.setForeground(Color.black);
        });
        
        //evento para mudar o tamanho da fonte do JLabel "lblTitle" para 12
        tamanho12.addActionListener((ActionEvent e) -> {
            tamanhoFonte = 12;
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //evento para mudar o tamanho da fonte do JLabel "lblTitle" para 16
        tamanho16.addActionListener((ActionEvent e) -> {
            tamanhoFonte = 16;
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //evento para mudar o tamanho da fonte do JLabel "lblTitle" para 16
        tamanho20.addActionListener((ActionEvent e) -> {
            tamanhoFonte = 20;
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //evento para mudar o tamanho da fonte do JLabel "lblTitle" para 24
        tamanho24.addActionListener((ActionEvent e) -> {
            tamanhoFonte = 24;
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //coloca o JLabel "lblTitle" em negrito
        negrito.addActionListener((ActionEvent e) -> {
            estilo = Font.BOLD;
            regular.setSelected(false);
            italico.setSelected(false);
            negritoItalico.setSelected(false);
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //coloca o JLabel "lblTitle" em italico
        italico.addActionListener((ActionEvent e) -> {
            estilo = Font.ITALIC;
            regular.setSelected(false);
            negrito.setSelected(false);
            negritoItalico.setSelected(false);
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //coloca o JLabel "lblTitle" em regular
        regular.addActionListener((ActionEvent e) -> {
            estilo = Font.PLAIN;
            italico.setSelected(false);
            negrito.setSelected(false);
            negritoItalico.setSelected(false);
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //coloca o JLabel "lblTitle" em negritoItalico
        negritoItalico.addActionListener((ActionEvent e) -> {
            estilo = Font.BOLD + Font.ITALIC;
            italico.setSelected(false);
            negrito.setSelected(false);
            regular.setSelected(false);
            lblTitle.setFont(new Font("", estilo, tamanhoFonte));
        });
        
        //adicionando os objetos na janela
        tela.add(lblCor);
        tela.add(lblEstilo);
        tela.add(lblTamanho);
        tela.add(lblTitle);
        tela.add(lista);
        tela.add(negrito);
        tela.add(italico);
        tela.add(regular);
        tela.add(negritoItalico);
        tela.add(tamanho12);
        tela.add(tamanho16);
        tela.add(tamanho20);
        tela.add(tamanho24);
        
        setSize(500,250);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ComboBoxCheckBoxJRadioButton app = new ComboBoxCheckBoxJRadioButton();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
