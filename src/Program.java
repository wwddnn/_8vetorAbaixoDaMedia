import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite um numero ");
            vetor[i] = sc.nextInt();
        }
        //média aritmética
        double soma = 0;
        double media = 0;
        for (int i = 0; i < n ; i++) {
            soma += vetor[i];
        }
        media = soma / n;
        System.out.printf("Média do vetor %.3f%n", media );
        //elementos abaixo da media
        System.out.println("Elementos abaixo da média ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
