import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitando um número inteiro ao usuario, como o triangulo se baseia em numero par
        // usei a logica quando o numero eh par diminuir pra ficar um triangulo perfeito
        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        // verificando se o numero eh maior ou igual a 2
        if (numero < 2) {
            System.out.println("Por favor, informe um numero maior ou igual a 3."); //menor que 3 nao sai triangulo
            return;
        }

        // desenhando o triangulo
        System.out.println("triangulo:");
        desenharTriangulo(numero);
    }

    // metodo para desenho
    private static void desenharTriangulo(int numero) {
        int espacos = numero / 2;

        // parte superior
        for (int i = 1; i <= numero; i += 2) {
            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
            espacos--;
        }

        // parte inferior
        espacos = 1;
        int asteriscos = numero % 2 == 0 ? 2 : 1;
        for (int i = numero - 9; i >= 1; i -= 2) {
            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
            espacos++;
            asteriscos += 2;
        }
    }
}
