package model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

public class ContaTest {
    Conta conta;
    static Extrato extrato;

    // @BeforeClass -> JUnit 4
    @BeforeAll
    public static void init() {
        extrato = mock(Extrato.class);
    }

    // @Before -> JUnit4
    @BeforeEach
    public void setup() {
        //extrato = new Extrato();
        conta = new Conta(extrato);

    }

    @Test
    @DisplayName("Teste Depositar")
    public void quandoDepositarValorPositivo_entaoAumentaValorDoSaldo() {
        // GIVEN
        BigDecimal valor = BigDecimal.valueOf(100);
        //when(extrato.registrar(TipoOperacao.deposito, valor)).thenReturn(true);
        //when(extrato.registrar(any(), any())).thenReturn(true);
        when(extrato.registrar(any(TipoOperacao.class), any(BigDecimal.class))).thenReturn(true);

        // WHEN
        boolean depositou = conta.depositar(valor);

        // THEN
        assertEquals(BigDecimal.valueOf(100), conta.getSaldo());
        assertTrue(depositou);
    }

    @Test
    @DisplayName("Teste Sacar")
    public void quandoSacarValorPositivo_entaoSubtraiValorDoSaldo() {
        // GIVEN
        BigDecimal valor = BigDecimal.valueOf(500);
        when(extrato.registrar(TipoOperacao.saque, valor)).thenReturn(true);
        conta.depositar(valor);

        // WHEN
        conta.sacar(BigDecimal.valueOf(10));

        // THEN
        assertEquals(BigDecimal.valueOf(490), conta.getSaldo());
    }
}
