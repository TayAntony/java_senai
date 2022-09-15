import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberRandom {
    public static void main(String[] args) {
        Random x = new Random();
        System.out.println(x.nextInt(18));//sorteando um valor entre 18

        ArrayList<String> cores = new ArrayList<>(); //criando um array e adicionando valores
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Preto");
        System.out.println(cores);

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();
        int ent;

        for(int j=0; j<tamanho; j++){
            System.out.printf("Digite o valor %d = ", j+1);
            ent = entrada.nextInt();
            valores.add(ent);
            if(ent%2==0){
                par.add(ent);
            }
            if(ent%2==1) {
                impar.add(ent);
            }
        }
        System.out.println("Valores = "+ valores);
        System.out.println("Pares = "+ par);
        System.out.println("Ímpares = "+impar);
    }
}
