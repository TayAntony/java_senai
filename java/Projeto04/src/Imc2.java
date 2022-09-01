import javax.swing.*;
import java.text.DecimalFormat;


public class Imc2 {
    public static void main(String[] args) {
        double formula;

        //importando decimal format para usar números formatados dentro do JoptionPane
        DecimalFormat formato = new DecimalFormat("#.00");
    
        //lendo nome
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        //lendo e convertendo peso
        String peso = JOptionPane.showInputDialog("Digite seu peso [XX.X]:  ");
        double peso_double = Double.parseDouble(peso);

        //lendo e convertendo altura
        String altura = JOptionPane.showInputDialog("Digite sua altura: [X.XX]:  ");
        double altura_double = Double.parseDouble(altura);

        //fazendo a fórmula de IMC
        formula = peso_double/(Math.pow (altura_double, 2));
        JOptionPane.showMessageDialog(null, "Olá " + nome + "!\nSeu IMC ideal é: "+ formato.format(formula));


        //criando as condições de descrição do IMC
        if (formula <18.5){
            JOptionPane.showMessageDialog(null, "Denutrição! PROCURE UM MÉDICO");}
    
        else if (formula >= 18.5 && formula <=24.5){
            JOptionPane.showMessageDialog(null, "Peso normal! PARABÉNS");}

        else if (formula >=25 && formula <=29.9){
            JOptionPane.showMessageDialog(null, "Sobrepeso! ATENÇÃO");}

        else if(formula >= 30 && formula <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesidade! CUIDADO");}

        else{
            JOptionPane.showMessageDialog(null, "Obesidade Mórbida! PROCURE UM MÉDICO");}
    }
}
