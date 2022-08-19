
import javax.swing.*;

public class Calcula {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String nascimento = JOptionPane.showInputDialog("Você nasceu em qual ano? ");
        int nasc = Integer.parseInt(nascimento); // convertendo o valor da caixinha em inteiro
        int idade = 2022-nasc; //calcula a idade
        JOptionPane.showMessageDialog(null, "Olá "+ nome +"! Você tem " + idade + " anos");

    }
}
