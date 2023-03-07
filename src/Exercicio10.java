import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho desejado para os Arrays: ");
        int size = scan.nextInt();

        int[] firstValues = new int[size];
        int[] secondValues = new int[size];

        System.out.println("\n1º Array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Posição " + i + ": ");
            firstValues[i] = scan.nextInt();
        }

        System.out.println("\n2º Array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Posição " + i + ": ");
            secondValues[i] = scan.nextInt();
        }

        calcSumValues(firstValues, secondValues);
    }

    public static void calcSumValues(int[] first, int[] second) {
        int length = first.length;
        int[] sumValues = new int[length * 2];
        System.out.println("\nValores unidos:");
        for (int i = 0; i < (length * 2); i++) {
            for (int j = (length - 1); j >= 0; j-- ) {
                if (first[i] == second[j]) {

                }
            }
        }
    }
}
