import java.util.Arrays;
import java.util.Scanner;

public class Lista02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int vetor = scan.nextInt();

        int[] lista = new int[vetor]; //definindo o tamanho da lista baseado no que o usuário digitou.

       try {
        for(int posicao = 1; posicao <= vetor; posicao++){
            System.out.printf("Digite o %d° valor: \n", (posicao));
            lista[posicao-1] = scan.nextInt();
        }

        Arrays.sort(lista);
        System.out.print("Sua lista ordenada: ");
        System.out.println(Arrays.toString(lista));
       } catch (Exception e) {
        System.out.println("Você digitou um valor inválido!");
       }
        scan.close();
    }
}
