import java.text.DecimalFormat;

import javax.swing.*;

public class Circulo2 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.00");
    
        //pedindo o valor do raio e convertendo
        String raio = JOptionPane.showInputDialog("DESCOBRINDO DIÂMETRO, PERÍMETRO E ÁREA\nDigite o RAIO do círculo: ");
        double raio_double = Double.parseDouble(raio);

        double diametro = 2*raio_double;
        double perimetro = 2*Math.PI*raio_double;
        double area = Math.PI * Math.pow(raio_double, 2);
        
        JOptionPane.showMessageDialog(null, "Diâmetro: " + formato.format(diametro) + "\nPerímetro: " + formato.format(perimetro) + "\nÁrea: " + formato.format(area));
    }
}
