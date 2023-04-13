
package com.mycompany.jtextfield;

import javax.swing.*; //importação biblioteca javax.swing
import java.awt.*; //importação biblioteca java.awt

//@author Pedro

public class Main extends JFrame { //criação classe main herdando da JFrame
    JLabel nome, idade, telefone, celular; //atributos JLabel
    TextField txtNome, txtIdade, txtTelefone, txtCelular; //atributos TextField
    
    public Main(){
        super("JTextField"); //nome da janela
        Container tela = getContentPane(); //criação do container
        setLayout(null); //limpar objetos da tela
        
        //atribuindo um valor ao JLabel
        nome = new JLabel("Nome"); 
        idade = new JLabel("Idade"); 
        telefone = new JLabel("Telefone");
        celular = new JLabel("Celular"); 
        
        //atribuindo quantidade caractere TextField
        txtNome = new TextField(50);
        txtIdade = new TextField(3);
        txtTelefone = new TextField(10);
        txtCelular = new TextField(10);
        
        //posicionando os JLabel na tela e declarando sua largura e altura
        nome.setBounds(50,20,40,20); //coluna, linha, largura, altura
        idade.setBounds(50,60,40,20);
        telefone.setBounds(50,100,80,20);
        celular.setBounds(50,140,80,20);
        
        //posicionamento dos TextField
        txtNome.setBounds(150,20,150,20);
        txtIdade.setBounds(150,60,150,20);
        txtTelefone.setBounds(150,100,150,20);
        txtCelular.setBounds(150,140,150,20);
        
        //foco no TextField
        txtNome.requestFocus();
        
        //atribuindo a cor dos JLabel
        nome.setForeground(Color.black);
        idade.setForeground(Color.black);
        telefone.setForeground(Color.black);
        celular.setForeground(Color.black);
        
        //atribuindo a fonte, peso e tamanho
        nome.setFont(new Font("Arial", Font.BOLD, 14));
        idade.setFont(new Font("Arial", Font.BOLD, 14));
        telefone.setFont(new Font("Arial", Font.BOLD, 14));
        celular.setFont(new Font("Arial", Font.BOLD, 14));
        
        //adicionando os JLabel na tela
        tela.add(nome);
        tela.add(idade);
        tela.add(telefone);
        tela.add(celular);
        
        //adicionando os TextField na tela
        tela.add(txtNome);
        tela.add(txtIdade);
        tela.add(txtTelefone);
        tela.add(txtCelular);
        
        setSize(400,250); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela fixa
    }
    
    public static void main(String[] args) {
        Main app = new Main(); //instancia do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opções da janela
    }
}
