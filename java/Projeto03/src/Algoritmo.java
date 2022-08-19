import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args){
        int x = 0, y = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite algum valor: ");
        x = scan.nextInt();

        if(x < 1){
            y = x;
        }
        else if(x == 1){
            y = 0;
        }
        else{
            y = x*x;
        }

        System.out.println("y = " + y);
        
        scan.close();
    }
}
