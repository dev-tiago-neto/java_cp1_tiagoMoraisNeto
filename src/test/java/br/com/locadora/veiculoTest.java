package br.com.locadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class veiculoTest {

    @Test
    void deveCalcularCustoSemDescontoParaMenosDeSeteDias() {
        veiculo veiculo = new veiculo("Palio", 80.0);
        double total = veiculo.calcularCusto(3);
        assertEquals(240.0, total);
    }

    @Test
    void deveAplicarDescontoEmAluguelLongo() {
        veiculo veiculo = new veiculo("Corolla", 150.0);
        double total = veiculo.calcularCusto(8); // 1200 - 10%
        assertEquals(1080.0, total);
    }

    @Test
    void deveRetornarValorCorretoDeMulta() {
        veiculo veiculo = new veiculo("Sandero", 90.0);
        double multa = veiculo.calcularMulta(4); // 4 * 90 * 0.2
        assertEquals(72.0, multa);
    }

    @Test
    void custoDeAluguelDeveSerZeroQuandoDiasForemZero() {
        veiculo veiculo = new veiculo("Ka", 95.0);
        double valor = veiculo.calcularCusto(0);
        assertEquals(0.0, valor);
    }

    @Test
    void devePermitirDiariaNegativaParaTesteDeLimite() {
        veiculo veiculo = new veiculo("HB20", -70.0);
        double resultado = veiculo.calcularCusto(2); // -140.0
        assertEquals(-140.0, resultado);
    }
}
