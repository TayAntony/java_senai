import java.util.Scanner;
public class DescobrirMaior {
    
    //elabore um programa que solicite vários números e no final mostre o maior e o menor, e só irá parar de pedir os números quando for digitado um número negativo
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //A variável (s) do scanner será sempre usada quando se quiser um input do usuário
        int numero = 0; int maior = 0; int menor = 0; //definindo 3 variáveis em uma linha só
        System.out.println("Vamos digitar alguns números: ");
        numero = s.nextInt(); //atribuir valor a variável (quando se coloca o nome da variavel sem tipo primitivo) é diferente de definir a variável (quando se coloca o tipo primitivo antes)
        maior = numero;
        menor = numero;

        if(numero >= 0) { //se o numero for maior/igual a 0 o if é executado
            while (numero>=0) { //o loop de perguntar o numero será feito enquanto o numero digitado foi maior que 0
                System.out.println("Vamos digitar alguns números: ");
                numero = s.nextInt(); //usando scanner (s) para guardar o proximo numero inteiro digitado pelo ususário 
                
                if(numero > maior){ //definindo o maior numero
                    maior = numero;
                }if(numero < menor && numero >=0){ //definindo o menor numero e apenas escolhendo os numeros maiores/iguais que 0
                    menor = numero;
                } 
                
            }
        }
        else{
            System.out.println("O primeiro valor foi negativo!"); //senão vai printar no terminal se o primeiro valor digitado for negativo (o que quebra o loop while)
        }
        
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("Volte sempre USUÁRIO :)");

        s.close();
    }
}
