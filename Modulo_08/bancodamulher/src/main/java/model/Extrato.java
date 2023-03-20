package model;

import java.math.BigDecimal;

public class Extrato {
    public boolean registrar(TipoOperacao tipoOperacao, BigDecimal valor) {
        if (tipoOperacao != null && valor != null) {
            System.out.println("Operacao de " + tipoOperacao + " no valor de R$ " + valor);
            return true;
        }
        else {
            return false;
            //throw new RuntimeException("Teste");
        }
    }
}
