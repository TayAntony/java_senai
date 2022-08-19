import java.util.Scanner;

public class PesoIdeal {
    //pedir altura e sexo de uma pessoa e construir um algoritmo que calcule o peso ideal usando as seguintes fórmulas:
    //para homens: (72.7 *altura) - 58
    //para mulheres: (62.1 * altura) - 44.7
    public static void  main(String[] args) {
        float altura = 0;
        char sexo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura {ex: 1,65}: ");
        altura = scan.nextFloat();

        System.out.println("Digite seu sexo [h] Homem / Mulher [m]: ");
        sexo = scan.next().charAt(0);

        if(sexo == 'h'){
            double homens = (72.7*altura) - 58;
            System.out.println("Seu peso ideal é " + homens + "kg");
        } else if (sexo == 'm'){
            double mulheres = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal é " + mulheres + "kg");
        } else{
            System.out.println("Não");
        }

        scan.close();
    }
}
