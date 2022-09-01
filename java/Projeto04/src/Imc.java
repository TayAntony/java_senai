import java.util.Scanner;

public class Imc{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.nextLine().toUpperCase();
        System.out.println("Seja bem vindo(a) " + nome);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        double peso, altura, formula;

        // lendo o peso
        System.out.println("Digite seu peso [XX,X]: ");
        peso = entrada.nextDouble();

        //lendo altura
        System.out.println("Digite sua altura [X,XX]: ");
        altura = entrada.nextDouble();

        //fazendo a fórmula de IMC
        formula = peso/(Math.pow (altura, 2));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Olá " + nome);
        System.out.printf("Seu IMC ideal é %.2f \n", formula);


        //criando as condições de descrição do IMC
        if (formula <18.5){
            System.out.println("Denutrição! PROCURE UM MÉDICO");;}
            
        else if (formula >= 18.5 && formula <=24.5){
            System.out.println("Peso normal! PARABÉNS");}

        else if (formula >=25 && formula <=29.9){
            System.out.println("Sobrepeso! ATENÇÃO");}

        else if(formula >= 30 && formula <= 39.9){
            System.out.println("Obesidade! CUIDADO");}

        else{
            System.out.println("Obesidade Mórbida! PROCURE UM MÉDICO");}

        entrada.close();
    }
}
