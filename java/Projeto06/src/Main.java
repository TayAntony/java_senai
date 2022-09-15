import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        int[] vetor = new int[tamanho];


        int p=0, im=0, j=0, k=0, ent=0;
        for (int i = 0; i<tamanho; i++){
            System.out.printf("Entre com o %d° valor: ", i+1);
            ent = entrada.nextInt();
            vetor[i] = ent;

            if(ent%2==0){
                p++;
            } else{
                im++;
            }
        }
            int[] par = new int[p];
            int[] impar = new int[im];

            for (int m=0; m<tamanho; m++){
                if (vetor[m]%2==0){
                    par[j]=vetor[m];
                    j++;
                }
                else{
                    impar[k]=vetor[m];
                    k++;
                }
            }
        System.out.println("A lista completa: " + Arrays.toString(vetor));
        System.out.println("A lista de pares: " + Arrays.toString(par));
        System.out.println("A lista de ímpares: " + Arrays.toString(impar));

    }
}
