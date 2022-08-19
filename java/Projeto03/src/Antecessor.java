import java.util.Scanner;

public class Antecessor {
    //elabore um programa que solicite um valor numérico e mostre o seu antecessor
    public static void main(String[] args) {
        int numero = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos digitar algum número: ");
        numero = scan.nextInt();
        int antecessor = numero-1;


        System.out.println("O antecessor de " + numero + " é " + antecessor);

        scan.close();

    }
}
