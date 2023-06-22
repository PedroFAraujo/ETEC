package com.etec.menu;

//@author Pedro

//importação das classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
    //criação dos objetos
    JMenuBar barra;
    JMenu opcoes, fonte, cor, estilo, tamanho;
    JMenuItem limpar, sair, azul, verde, vermelho, amarelo, preto;
    JCheckBoxMenuItem nomeE[];
    ButtonGroup grupoT, grupoE;
    JRadioButtonMenuItem tamanhoF[];
    String tam[] = {"12", "14", "16", "18"};
    String est[] = {"Normal", "Negrito", "Itálico", "Negrito e Itálico"};
    JTextArea texto;
    JPanel painel;
    JScrollPane rolagem;
    int estiloFonte, tamanhoFonte;
    
    //metodo construtor
    public Menu(){
        super("Exemplo de Menus com Ações"); //titulo da janela
        Container tela = getContentPane(); //instancia do objeto tela da classe container
        tela.setLayout(null);
        
        estiloFonte = Font.PLAIN; //atribuindo o estilo regular a variavel "estiloFonte" 
        tamanhoFonte = 12; //atribuindo 12 a variavel "tamanhoFonte" 
        
        barra = new JMenuBar(); //instancia do objeto
        setJMenuBar(barra);
        
        opcoes = new JMenu("Opções"); //instancia do objeto opcoes e atribuição de conteudo
        barra.add(opcoes); //adicionando "opcoes" a barra
        
        //instanciando objetos e os atribuindo ao menu, apos o click de "opcoes"
        fonte = new JMenu("Fonte");
        cor = new JMenu("Cor");
        estilo = new JMenu("Estilo");
        
        //instancia dos itens do menu e atribuicao de conteudo
        limpar = new JMenuItem("Limpar");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");
        
        TratadorE tratarEstilo = new TratadorE(); //instancia do objeto "tratarestilo" da classe TratadorE
        
        grupoE = new ButtonGroup(); //instancia do objeto
        nomeE = new JCheckBoxMenuItem[4]; //instancia do objeto
        
        for (int i = 0; i < 4; i++) {
            nomeE[i] = new JCheckBoxMenuItem(est[i]);
            estilo.add(nomeE[i]);
            grupoE.add(nomeE[i]);
            nomeE[i].addItemListener(tratarEstilo);
        }
        
        TratadorT tratarTamanho = new TratadorT();
        tamanho = new JMenu("Tamanho");
        grupoT = new ButtonGroup();
        tamanhoF = new JRadioButtonMenuItem[4];
        
        for (int i = 0; i < 4; i++) {
            tamanhoF[i] = new JRadioButtonMenuItem(tam[i]);
            tamanho.add(tamanhoF[i]);
            grupoT.add(tamanhoF[i]);
            tamanhoF[i].addItemListener(tratarTamanho);
        }
        
        sair = new JMenuItem("Sair"); //instancia do objeto e atribuição de conteudo
        
        //eventos de atalho de teclado
        opcoes.setMnemonic(KeyEvent.VK_O);
        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        cor.setMnemonic(KeyEvent.VK_C);
        estilo.setMnemonic(KeyEvent.VK_E);
        tamanho.setMnemonic(KeyEvent.VK_T);
        
        //adicionando o Menu dentro de "opcoes"
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.add(sair);
        opcoes.addSeparator();
        
        //adicionando itens do menu dentro da opcao "fonte"
        fonte.add(cor);
        fonte.add(estilo);
        fonte.add(tamanho);
        
        //adicionando itens do menu dentro da opcao "cor"
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        
        texto = new JTextArea(10,20); //instanciando um TextArea
        
        //instancia do objeto e configuracao da barra de rolagem
        rolagem = new JScrollPane(texto); 
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        //instancia do objeto, adição da barra de rolagem, posicionamento da tela e adicionando o painel na tela
        painel = new JPanel();
        painel.add(rolagem);
        painel.setBounds(30,30,350,350);
        tela.add(painel);
        
        //evento para limpar o que está escristo no TextArea
        limpar.addActionListener((ActionEvent e) -> {
            texto.setText("");
            texto.requestFocus();
        });
        
        //evento para mudar a cor do texto dentro do TextArea para azul
        azul.addActionListener((ActionEvent e) -> {
            texto.setForeground(Color.blue);
            repaint();
        });
        
        //evento para mudar a cor do texto dentro do TextArea para verde
        verde.addActionListener((ActionEvent e) -> {
            texto.setForeground(Color.green);
            repaint();
        });
        
        //evento para mudar a cor do texto dentro do TextArea para vermelho
        vermelho.addActionListener((ActionEvent e) -> {
            texto.setForeground(Color.red);
            repaint();
        });
        
        //evento para mudar a cor do texto dentro do TextArea para amarelo
        amarelo.addActionListener((ActionEvent e) -> {
            texto.setForeground(Color.yellow);
            repaint();
        });
        
        //evento para mudar a cor do texto dentro do TextArea para preto
        preto.addActionListener((ActionEvent e) -> {
            texto.setForeground(Color.black);
            repaint();
        });
        
        //evento para sair do programa
        sair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        setSize(500,350);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Menu app = new Menu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class TratadorE implements ItemListener{
        @Override
        //evento para alterar o estilo da fonte conforme a opcao escolhida pelo user
        public void itemStateChanged(ItemEvent e){
            if(nomeE[0].isSelected())
                estiloFonte = Font.PLAIN;
            if(nomeE[1].isSelected())
                estiloFonte = Font.BOLD;
            if(nomeE[2].isSelected())
                estiloFonte = Font.ITALIC;
            if(nomeE[3].isSelected())
                estiloFonte = Font.BOLD + Font.ITALIC;
            texto.setFont(new Font("", estiloFonte, tamanhoFonte));
            repaint();
        }
    }
    
    private class TratadorT implements ItemListener{
        @Override
        //evento para alterar o tamanho da fonte conforme a opcao escolhida pelo user
        public void itemStateChanged(ItemEvent e){
            if(tamanhoF[0].isSelected())
                tamanhoFonte = 12;
            if(tamanhoF[1].isSelected())
                tamanhoFonte = 14;
            if(tamanhoF[2].isSelected())
                tamanhoFonte = 16;
            if(tamanhoF[3].isSelected())
                tamanhoFonte = 18;
            texto.setFont(new Font("", estiloFonte, tamanhoFonte));
            repaint();
        }
    }
}
