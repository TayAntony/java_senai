import java.sql.SQLOutput;

public class Matriz {
    public static void main(String[] args) {
        String[][] matriz = {
                {"Tayssa", "|18|", "|50kg|", "|1.60|"},
                {"Viktor", "|18|", "|65kg|", "|1.85|"},
                {"Tatiane", "|42|", "|75kg|", "|1.70|"},
        };

        System.out.println("=-=-=-=-=-=-=-=-=- TABELA -=-=-=-=-=-=-=-=-=");
        System.out.println("NOME        IDADE       PESO        ALTURA");
        System.out.println("--------------------------------------------");

        for(int i=0; i<4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }
            System.out.println("");
        }
    }
}
