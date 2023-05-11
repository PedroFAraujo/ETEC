package com.cursojava.jlogin;

//@author Pedro

//importação das bibliotecas
import javax.swing.*; 
import java.awt.*;


public class JLogin extends JFrame{
    //criação da variável botao que recebe JButton
    JLabel nome, senha, comentario;
    JPasswordField senhaBOX;
    TextField nomeTXT, senhaTXT; 
    TextArea comentarioTXT;
    JButton okBtn, cancelarBtn;
    
    //criação da função Botao para criar a interface gráfica
    public JLogin(){
        super("Login"); //nome da janela
        Container tela = getContentPane(); //criação do container com o nome tela
        setLayout(null); //limpar objetos da tela
        
        //atribuição de um valor ao Jlabel
        nome = new JLabel("Nome");
        senha = new JLabel("Senha");
        comentario = new JLabel("Comentário");
        
        //atribuindo quantidade caractere TextField
        nomeTXT = new TextField(50);
        comentarioTXT = new TextArea();
        
        //atribuindo ao JPasswordField
        senhaBOX = new JPasswordField(20);
        
        //atribuindo valor aos JButton
        okBtn = new JButton("OK");
        cancelarBtn = new JButton("Cancelar");
        
        //posicionamento dos JLabel na tela
        //coluna, linha, largura, altura
        nome.setBounds(20, 10, 40, 20);
        senha.setBounds(20, 70, 40, 20);
        comentario.setBounds(20, 130, 80,20);
        
        //posicionamento dos TextField na tela
        nomeTXT.setBounds(20, 30, 350, 25);
        comentarioTXT.setBounds(20,150,350,200);
        
        //posicionamento do JPasswordField na tela
        senhaBOX.setBounds(20, 90, 350, 25);
        
        //posicionamento dos JButton na tela
        okBtn.setBounds(20, 200, 50,30);
        cancelarBtn.setBounds(20, 250, 80,30);
        
        //adicionando os JLabel na tela
        tela.add(nome);
        tela.add(senha);
        tela.add(comentario);
        
        //adicionando os TextField na tela
        tela.add(nomeTXT);
        tela.add(comentarioTXT);
        
        //adicionando o JPasswordField na tela
        tela.add(senhaBOX);
        
        //adicionando os JButton na tela
        tela.add(okBtn);
        tela.add(cancelarBtn);
        
        setSize(400,600); //atribuindo um tamanho para tela
        setVisible(true); //janela visivel
        setLocationRelativeTo(null); //janela ao centro
        setResizable(false); //janela fixa

    }
    
    public static void main(String[] args) {
        JLogin app = new JLogin(); //instancia do objeto
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //opções da janela
    }
}
