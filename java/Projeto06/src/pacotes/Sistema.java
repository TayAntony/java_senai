package pacotes;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        System.out.println(eu.apresentar());
        eu.dormir();

        Scanner x = new Scanner(System.in);
        System.out.println("Nome: ");
        eu.mostrarNome(x.nextLine());

    }
}
