import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int large,small;

        System.out.print("Digite o tamanho desejado para o Array: ");
        int size = scan.nextInt();

        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            values[i] = scan.nextInt();
        }

        large = small = values[0];

        for(int i = 1; i < size; ++i) {
            if(values[i] > large) {
                large = values[i];
            }

            if(values[i] < small) {
                small = values[i];
            }
        }

        System.out.println("\nO menor valor é: " + small);
        System.out.println("O maior valor é: " + large);
    }
}
