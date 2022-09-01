import javax.swing.JOptionPane;

public class Imc_switch {
    public static void main(String[] args) {

        String p = JOptionPane.showInputDialog(null, "Digite o peso", "Peso", 1);
        float peso = Float.parseFloat(p);

        String a = JOptionPane.showInputDialog(null, "Digite a altura:", "Altura", 1);
        float altura = Float.parseFloat(a);

        float imc = (peso / (altura * altura));

        System.out.println(imc);
        String txt = "";


        // int x = 10;
        // switch (x) {
        //     case 0:
        //         JOptionPane.showMessageDialog(null, "zero");
        //         break;
        //     case 10:
        //         JOptionPane.showMessageDialog(null, "dez");
        //         break;
        // }

        if (imc < 18.5) {
            txt = "Magreza";
        } else if (imc < 25) {
            txt = "Saudavel";
        } else if (imc < 30) {
            txt = "Sobrepeso";
        } else if (imc >= 30) {
            txt = "Obeso";
        }

        StringBuilder out = new StringBuilder("");
        out.append("Tabela IMC\n");
        out.append("Magreza\n");
        out.append("Saudável\n");
        out.append("Sobrepeso\n");
        out.append("Obeso\n");
        out.append("Resultado = ").append(txt);

        JOptionPane.showMessageDialog(null, out.toString(), "IMC", 1);
    }
}
