
import javax.swing.JOptionPane;

//@author Pedro

public class EntradaSaidaDados {
    //metodo que realiza a entrada de dados
    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    //metodo que realiza a saida de dados
    public void saidaDados(String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
