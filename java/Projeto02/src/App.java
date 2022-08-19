import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner s = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println(nome);

        
        s.close(); //para fechar o scanner e evitar minhoquinha de erro amarela
    }
}
