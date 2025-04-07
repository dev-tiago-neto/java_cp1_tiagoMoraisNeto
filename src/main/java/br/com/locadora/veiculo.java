package br.com.locadora;

public class veiculo {
    private String nomeModelo;
    private double precoPorDia;

    private static final double DESCONTO_SEMANA = 0.10;
    private static final double TAXA_MULTA = 0.20;

    public veiculo(String nomeModelo, double precoPorDia) {
        this.nomeModelo = nomeModelo;
        this.precoPorDia = precoPorDia;
    }

    public double calcularCusto(int diasAluguel) {
        double valorBruto = precoPorDia * diasAluguel;
        double valorDesconto = aplicarDesconto(diasAluguel);
        return valorBruto - valorDesconto;
    }

    public double aplicarDesconto(int dias) {
        return (dias >= 7) ? precoPorDia * dias * DESCONTO_SEMANA : 0.0;
    }

    public double calcularMulta(int diasEmAtraso) {
        return diasEmAtraso * precoPorDia * TAXA_MULTA;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }
}
