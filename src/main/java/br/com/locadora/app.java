package br.com.locadora;

public class app {
    public static void main(String[] args) {
        veiculo veiculoSelecionado = new veiculo("Fiat Uno", 100.0);

        int quantidadeDias = 10;
        int diasDeAtraso = 2;

        double valorTotal = veiculoSelecionado.calcularCusto(quantidadeDias);
        double valorMulta = veiculoSelecionado.calcularMulta(diasDeAtraso);

        System.out.println("== Detalhes do Aluguel ==");
        System.out.println("Veículo: " + veiculoSelecionado.getNomeModelo());
        System.out.println(String.format("Total para %d dias: R$ %.2f", quantidadeDias, valorTotal));
        System.out.println(String.format("Multa por %d dias de atraso: R$ %.2f", diasDeAtraso, valorMulta));
    }
}
