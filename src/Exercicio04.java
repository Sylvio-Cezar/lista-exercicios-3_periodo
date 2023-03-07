import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho desejado para o Array: ");
        int size = scan.nextInt();

        int[] values = new int[size];
        int[] newValues = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            values[i] = scan.nextInt();
            newValues[i] = values[i] * values[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Posição " + i + " antigo:" + values[i]);
            System.out.println("Posição " + i + " novo:" + newValues[i]);
        }
    }
}
