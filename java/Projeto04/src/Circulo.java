import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        System.out.println("DESCOBRINDO DIÂMETRO, PERÍMETRO E ÁREA:");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        double diametro = 2*raio;
        double perimetro = 2*Math.PI*raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O diâmetro = %.2f \nO perímetro = %.2f \nA área = %.2fm", diametro, perimetro, area);

        entrada.close();
    }
}
