package calculadora;

//@author Pedro

//importação das classes 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Util extends JFrame {
    
    //instância dos objetos
    JLabel labelNum1, labelNum2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, dividir, multiplicar;
    
    public Util(){
        super("Calculadora"); //título da janela
        Container tela = getContentPane(); //criação do container janela
        setLayout(null); //setando o layout como nulo
        
        //atribuindo valores aos rótulos
        labelNum1 = new JLabel("1º número: ");
        labelNum2 = new JLabel("2º número: ");
        exibir = new JLabel("");
        
        //atribuindo tamanho a caixa de texto
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        //atribuindo valores ao botão
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        dividir = new JButton("Dividir");
        multiplicar = new JButton("Multiplicar");
        
        //posicionando os elementos
        //coluna, linha, largura, altura
        labelNum1.setBounds(50, 20, 100, 20);
        labelNum2.setBounds(50, 60, 100, 20);
        exibir.setBounds(50, 130, 200, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        somar.setBounds(50, 100, 80, 20);
        subtrair.setBounds(140, 100, 80, 20);
        dividir.setBounds(230, 100, 80, 20);
        multiplicar.setBounds(320, 100, 100, 20);
        
        somar.addActionListener( //adiciona uma ação ao botão somar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        int num1, num2, soma; //criação de variáveis
                        soma = 0; 
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        
                        soma = (num1 + num2); //efetua a operação
                        exibir.setVisible(true); //o JLabel exibir fica visivel na tela
                        exibir.setText(num1 + " + " + num2 + " = " + soma); //atribui valor ao JLabel exibir
                    }
                }
        );
        
        subtrair.addActionListener( //adiciona uma ação ao botão subtrair
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        int num1, num2, subtrair; //criação de variáveis
                        subtrair = 0;
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        
                        subtrair = (num1 - num2); //efetua a operação
                        exibir.setVisible(true); //o JLabel exibir fica visivel na tela
                        exibir.setText(num1 + " - " + num2 + " = " + subtrair); //atribui valor ao JLabel exibir
                    }
                }
        );
        
        dividir.addActionListener( //adiciona uma ação ao botão dividir
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        int num1, num2, dividir; //criação de variáveis
                        dividir = 0;
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        
                        dividir = (num1 / num2); //efetua a operação
                        exibir.setVisible(true); //o JLabel exibir fica visivel na tela
                        exibir.setText(num1 + " / " + num2 + " = " + dividir); //atribui valor ao JLabel exibir
                    }
                }
        );
        
        multiplicar.addActionListener( //adiciona uma ação ao botão multiplicar
                new ActionListener(){ //cria a ação
                    public void actionPerformed(ActionEvent e){ //e = evento de clique
                        int num1, num2, multiplicar; //criação de variáveis
                        multiplicar = 0;
                        
                        //conversao do input da String do JTextField para inteiro e o atribuindo para a variavel
                        num1 = Integer.parseInt(texto1.getText());
                        num2 = Integer.parseInt(texto2.getText());
                        
                        multiplicar = (num1 * num2); //efetua a operação
                        exibir.setVisible(true); //o JLabel exibir fica visivel na tela
                        exibir.setText(num1 + " x " + num2 + " = " + multiplicar); //atribui valor ao JLabel exibir
                    }
                }
        );
        
        exibir.setVisible(false); //JLabel rotulo não fica visivel
        
        //adicionando os objetos na tela
        tela.add(labelNum1);
        tela.add(labelNum2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);
        tela.add(exibir);
        
        setSize(465,250); //tamanho da janela
        setVisible(true); //janela visivel
    }
}
