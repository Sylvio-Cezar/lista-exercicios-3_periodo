import java.util.Scanner;
import java.util.Arrays;

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

        calcSumArrays(firstValues, secondValues);
    }

    public static void calcSumArrays(int[] first, int[] second) {
        int length = first.length * 2;
        int[] sumValues = new int[length];
        System.out.println("\nValores unidos:");
        for (int i = 0, j = 0; i < length;) {
            if (j < first.length) {
                sumValues[i++] = first[j];
            }
            if (j < second.length) {
                sumValues[i++] = second[j];
            }
            j++;
        }
        sumValues = Arrays.stream(sumValues).distinct().toArray();
        Arrays.sort(sumValues);

        for (int i = 0; i < sumValues.length; i++) {
            System.out.println("Posição " + i + ": " + sumValues[i]);
        }
    }
}
