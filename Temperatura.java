import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada Temperatura
        System.out.print("Informe a temperatura: ");
        double temperatura = scanner.nextDouble();

        // entrada unidade de origem
        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F] ");
        char origem = scanner.next().toUpperCase().charAt(0);

        // verificando se a unidade eh valida
        if (origem != 'C' && origem != 'K' && origem != 'F') {
            System.out.println("Entrada especificada nao eh valida.");
            return;
        }

        // entrada da unidade de destino
        System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F] ");
        char destino = scanner.next().toUpperCase().charAt(0);

        // verificando se a unidade de destino eh valida
        if (destino != 'C' && destino != 'K' && destino != 'F') {
            System.out.println("Entrada especificada nao eh valida.");
            return;
        }

        // Convertendo a temperatura
        double tempConvertida;
        if (origem == 'C') {
            if (destino == 'K') {
                tempConvertida = temperatura + 273.15;
            } else {
                tempConvertida = (temperatura * 9 / 5) + 32;
            }
        } else if (origem == 'K') {
            if (destino == 'C') {
                tempConvertida = temperatura - 273.15;
            } else {
                tempConvertida = (temperatura - 273.15) * 9 / 5 + 32;
            }
        } else {
            if (destino == 'C') {
                tempConvertida = (temperatura - 32) * 5 / 9;
            } else {
                tempConvertida = (temperatura - 32) * 5 / 9 + 273.15;
            }
        }

        // Resultado
        System.out.printf("%.2f %s = %.2f %s%n", temperatura, origem, tempConvertida, destino);
    }
}