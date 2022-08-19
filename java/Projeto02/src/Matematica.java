
import javax.swing.*;
import java.text.DecimalFormat;

public class Matematica {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Digite um número: ");
        String numero2 = JOptionPane.showInputDialog("Digite outro número: ");
        double num1 = Integer.parseInt(numero1);
        double num2 = Integer.parseInt(numero2);
        double resultado = num1/num2;
        
        //double arredondaParaCima= Math.ceil(num1/num2);              arredonda para cima
        //double arredondaParaBaixo= Math.floor(num1/num2);            arredonda pra abaixo
        //int inteiro = Math.round(num1/num2);                         tira as casas decimais
        DecimalFormat decimais = new DecimalFormat("#.00"); //numero com 2 casas decimais forçadas

        //System.out.printf("Arrendondando para cima: %f \nArredondando para baixo: %f \nSem casas decimais: %d \nCom duas casas decimais: "+ decimais.format(num1/num2), arredondaParaCima, arredondaParaBaixo, inteiro);
        JOptionPane.showMessageDialog(null, "O número " + num1 + " dividido por " + num2 + " é igual a: " + resultado + "\nArredondando para cima: " + Math.ceil(resultado) + "\nArredondando para baixo: " + Math.floor(resultado) + "\nSem casas decimais: " + Math.round(resultado) + "\nCom duas casas decimais: " + decimais.format(resultado));
    }
}
