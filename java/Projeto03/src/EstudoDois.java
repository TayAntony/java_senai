public class EstudoDois {
    public static void main(String[] args) {
        int contador = 5;
        while(contador!=0){
            contador -= 1;
            System.out.println("valor da variável: " + contador);
        }

        do {
            System.out.println("valor da variável: " + contador);
        }while (contador!=0);

    }
}
