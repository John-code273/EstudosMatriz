import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Entre com o número de de linhas: ");
        int m = scanner.nextInt();
        System.out.print("Agora entre com o número de colunas: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Qual número da matriz voce deseja procurar? ");
        int x = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println();
                    System.out.println("Posição: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("down: " + matriz[i + 1][j]);
                    }
                }
            }

        }
    }
}