import java.util.Scanner;

public class Exercicio08 {
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

        calcEqualValues(firstValues, secondValues);
    }

    public static void calcEqualValues(int[] first, int[] second) {
        int length = first.length;
        System.out.println("\nValores iguais:");
        for (int i = 0; i < length; i++) {
            for (int j = (length - 1); j >= 0; j-- ) {
                if (first[i] == second[j]) {
                    System.out.println(first[i] + ", presente na posição " + i +
                            " do 1º Array e na posição " + j + " do 2º Array");
                }
            }
        }
    }
}
