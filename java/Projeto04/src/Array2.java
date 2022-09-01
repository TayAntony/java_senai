import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] valores = {1,8,7,4,1,2,9,};

        for(int inicio = 0; inicio < valores.length; inicio++){
            System.out.print(" | " + valores[inicio]);
        };

        System.out.println("\n " + Arrays.toString(valores)); //modo usado para printar no estilo raiz da lista, com [, , ,]
    }
}
