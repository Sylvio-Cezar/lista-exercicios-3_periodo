import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalSum = 0;

        System.out.print("Digite o tamanho desejado para o Array: ");
        int size = scan.nextInt();

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            values[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            totalSum += values[i];
        }

        System.out.println("A soma dos número é: " + totalSum);
    }
}
