import java.util.Scanner;

public class Medias {
    static int contador;
    static int menu;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Selecione a opção desejada");
            System.out.println("1- Media Aritmetica");
            System.out.println("2- Media Ponderada");
            System.out.println("3- Encerrar Programa");
            menu = scan.nextInt();

            if (menu == 3) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Quantos dados serão inseridos: ");
            contador = scan.nextInt();

            switch (menu) {
                case (1):
                    mediaAritmetica();
                    break;

                case (2):
                    mediaPonderada();
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
    public static void mediaAritmetica() {
        double media = 0.0;
        for (int i = 1; i <= contador; i++) {
            System.out.print("Digite " + i + "º numero: ");
            media = media + scan.nextDouble();
        }

        System.out.println("Resultado Media: " + media / contador);
    }
    public static void mediaPonderada() {
        double media = 0.0;
        double peso = 0.0;
        double somaPeso = 0.0;
        for (int i = 1; i <= contador; i++) {
            System.out.print("Digite " + i + "ª numero: ");
            double numero = scan.nextDouble();
            System.out.print("Digite " + i + "º peso: ");
            peso = scan.nextDouble();
            media = media + (numero * peso);
            somaPeso = somaPeso + peso;
        }

        System.out.println("Resultado da Media Ponderada: " + media / somaPeso);
    }
}