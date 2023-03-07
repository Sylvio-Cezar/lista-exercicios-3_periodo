import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int number;

        do {System.out.print("Digite o próximo número ou 0 para encerrar: ");
            number = scan.nextInt();
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        } while (number != 0);

        System.out.println("\nQuantidade de pares: " + --even);
        System.out.println("Quantidade de ímpares: " + odd);
    }
}
