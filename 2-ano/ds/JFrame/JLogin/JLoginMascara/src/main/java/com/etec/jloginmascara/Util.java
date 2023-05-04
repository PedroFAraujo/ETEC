package com.etec.jloginmascara;

//@author Pedro

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class Util extends JFrame {
    JLabel lblCEP, lblTel, lblCPF, lblData;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaraCEP, mascaraTel, mascaraCPF, mascaraData;
    JButton BTNCadastrar;
    
    public Util(){
        super("Máscara FormattedTextField"); //nome janela
        Container tela = getContentPane(); //container tela
        setLayout(null); 
        
        //atribuição do conteúdo dos JLabel
        lblCEP = new JLabel("CEP");
        lblTel = new JLabel("Telefone");
        lblCPF = new JLabel("CPF");
        lblData = new JLabel("Data");
        
        //atribuindo valor ao botao
        BTNCadastrar = new JButton("Cadastrar");
        
        //posicionamento dos JLabel
        //coluna, linha, largura, altura
        lblCEP.setBounds(50,40,100,20);
        lblTel.setBounds(50,80,100,20);
        lblCPF.setBounds(50,120,100,20);
        lblData.setBounds(50,160,100,20);
        
        //posicionando botao
        //coluna, linha, largura, altura
        BTNCadastrar.setBounds(150, 200, 100, 20);
        
        BTNCadastrar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        String cepAction, telAction, cpfAction, dataAction; //criação de variáveis
                        
                        //atribui o input da String dos 
                        cepAction = (cep.getText());
                        telAction = (tel.getText());
                        cpfAction = (cpf.getText());
                        dataAction = (data.getText());
                        
                        JOptionPane.showMessageDialog(null, "CEP: " + cepAction + "\n\nTelefone: " + telAction + "\n\nCEP: " + cpfAction + "\n\nData: " + dataAction );
                    }
                }
        );
         
        //atribuindo as máscaras
        try{
            mascaraCEP = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraCPF = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");
            
            mascaraCEP.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
        }catch(ParseException excp){}
        
        //colocando a mascara nos JFormattedTextField
        cep = new JFormattedTextField(mascaraCEP);
        tel = new JFormattedTextField(mascaraTel);
        cpf = new JFormattedTextField(mascaraCPF);
        data = new JFormattedTextField(mascaraData);
        
        //posicionamento dos JFormattedTextField na tela
        cep.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        cpf.setBounds(150,120,100,20);
        data.setBounds(150,160,100,20);
        
        //colocando os JLabel na tela
        tela.add(lblCEP);
        tela.add(lblTel);
        tela.add(lblCPF);
        tela.add(lblData);
        
        //colocando os JFormattedTextField na tela
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        //colocando JButton na tela
        tela.add(BTNCadastrar);
        
        setSize(400,300); //tamanho da tela
        setVisible(true); //tela visível
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa
    }
}
