import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        System.out.print("Digite o tamanho desejado para o Array: ");
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("\nQuantidade de pares: " + even);
        System.out.println("Quantidade de ímpares: " + odd);
    }
}
