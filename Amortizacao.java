import java.util.Scanner;


public class Amortizacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada valor emprestimo
        System.out.print("Informe o valor do emprestimo: ");
        double emprestimo = scanner.nextDouble();

        System.out.print("Informe a taxa de juros ao mes (%): ");
        double juros = scanner.nextDouble() / 100.0;

        System.out.print("Informe o numero de meses para pagamento: ");
        int meses = scanner.nextInt();

        // calculando a amortização
        double amortizacao = emprestimo / meses;

        // saldo devedor
        double saldoDevedor = emprestimo;

        double totalPagoJuros = 0;
        double totalPagoAmortizacao = 0;

        // informações iniciais
        System.out.printf("Valor fixo da amortizacao: R$ %.2f%n", amortizacao);
        System.out.printf("Saldo devedor total: R$ %.2f com uma taxa de juros de %.2f%% ao mes%n", saldoDevedor, juros * 100);

        // loop para cada mês
        for (int i = 1; i <= meses; i++) {
            // calculando os juros do mes
            double jurosMensal = saldoDevedor * juros;

            // calculando a prestacao do mes
            double prestacao = jurosMensal + amortizacao;

            // atualizando o saldo devedor
            saldoDevedor -= amortizacao;

            // total pago em juros e amortizacao
            totalPagoJuros += jurosMensal;
            totalPagoAmortizacao += amortizacao;

            // informações do mes
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestacao: R$ %.2f | Saldo devedor: R$ %.2f%n",
                    i, jurosMensal, prestacao, saldoDevedor);
        }

        // Total pago
        double totalPago = totalPagoJuros + totalPagoAmortizacao;
        System.out.printf("Total: Prestacao R$ %.2f, Juros R$ %.2f, Amortizacao R$ %.2f%n",
                totalPago, totalPagoJuros, totalPagoAmortizacao);
    }
}