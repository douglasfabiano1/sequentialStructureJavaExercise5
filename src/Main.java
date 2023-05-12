import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        for (var i = 0; i<2; i++) {
            System.out.print("Código da peça: ");
            int partId = sc.nextInt();
            System.out.printf("Quantidade de peças cod.%d: ", partId);
            int quantity = sc.nextInt();
            System.out.printf("Valor unitário de cada peça cod.%d: ", partId);
            double price = sc.nextDouble();
            total += quantity * price;
            System.out.println();
        }

        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
