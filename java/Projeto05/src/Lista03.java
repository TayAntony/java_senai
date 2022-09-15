import java.util.Scanner;
import java.util.Arrays;

public class Lista03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int vetor = scan.nextInt();

        int[] lista = new int[vetor];

        try {
            for(int posicao = 1; posicao <= vetor; posicao++){
                System.out.printf("Digite o %d° valor: \n", (posicao));
                lista[posicao-1] = scan.nextInt();
            }

            int numeros = scan.nextInt();
            int p = 0; int i = 0;
            
            if(numeros%2==0){
                p++;
            } else{
                i++;
            }

            int[] pares = new int[p];
            int[] impares = new int[i];

            for(int posicao = 1; posicao < vetor; posicao++){
                if(lista[posicao]%2==0){
                    pares[p] = lista[posicao];
                    p++;
                }
                else{
                    impares[i] = lista[posicao];
                    i++;
                }
            }
            
            System.out.println(Arrays.toString(pares));
            System.out.println(Arrays.toString(impares));
            System.out.println(Arrays.toString(lista));
            
           } catch (Exception e) {
            System.out.println("Você digitou um valor inválido!");
           }
            scan.close();
    }
}
