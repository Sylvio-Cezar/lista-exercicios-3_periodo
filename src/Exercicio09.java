import java.util.Scanner;

public class Exercicio09 {
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

        calcDiffValues(firstValues, secondValues);
    }

    public static void calcDiffValues(int[] first, int[] second) {
        int length = first.length;
        System.out.println("\nValores únicos do 1º Array:");
        for (int i = 0; i < length; i++) {
            boolean isFirstDiff = true;
            for (int j = (length - 1); j >= 0; j-- ) {
                if (first[i] == second[j]) {
                    isFirstDiff = false;
                }
            }
            if (isFirstDiff) {
                System.out.println(first[i]);
            }
        }
    }
}
