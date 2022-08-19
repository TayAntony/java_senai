import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int y = 8;
        Scanner s = new Scanner(System.in);
        System.out.println("Idade: ");
        int x = s.nextInt();
        System.out.println(x+y);

        s.close();
    }
}
