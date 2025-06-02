import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int n = sr.nextInt();
        double[] vect = new double[n];
        int contador = 0;

        // Leitura dos números
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vect[i] = sr.nextDouble();
        }

        // Verificação e contagem dos números pares
        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < n; i++) {
            if ((int) vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                contador++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + contador);
        sr.close();
    }
}
