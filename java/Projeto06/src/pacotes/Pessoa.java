package pacotes;

public class Pessoa {
    void mostrarNome(String nome){
        System.out.println(nome);
    }

    String nome = "Tayssa";
    void dormir(){
        System.out.println("ZzZzZZzZzZZz");
    }
    String apresentar(){
        return "Meu nome é " + nome;
    }
}
