
import javax.swing.*;

public class Operadores {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade:  ");
        double id = Integer.parseInt(idade);
        String resultado = (id >= 18) ? "Olá " + nome + "\nVocê é maior de idade" : "Olá " + nome + "\nVocê é menor de idade";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
