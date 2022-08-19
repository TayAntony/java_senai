import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totmaior = 0; int totmenor = 0; int idade = 0; int homem = 0; int mulher = 0; char sexo = 'f'; char continuar = 's';
        System.out.println("Vamos cadastrar umas pessoas? ");


        while (continuar == 's'){
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Digite seu sexo [masculino/feminino]: ");
            sexo = scan.next().charAt(0);

            System.out.println("Quer continuar? [s/n]");
            continuar = scan.next().charAt(0);
            //contando os maiores e menores de idade       
            if (idade < 18){
                totmenor ++;
            } else{
                totmaior ++;
            }
            if(sexo == 'f'){
                mulher++;
            } else{
                homem++;
            }
        }
        System.out.println("A quantidade de menores de idade é: " + totmenor);
        System.out.println("A quantidade de maiores de idade é:  " + totmaior);
        System.out.println("A quantidade de homens é: " + homem);
        System.out.println("A quantidade de mulheres é: " + mulher);

        scan.close();
    }
}
