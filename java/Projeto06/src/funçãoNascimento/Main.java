package funçãoNascimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int atual, nasc;
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        atual = x.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        nasc = x.nextInt();

        Nascimento n = new Nascimento();
        n.idade(atual, nasc);
    }

}
