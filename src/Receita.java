
import java.math.BigDecimal;

public class Receita extends Transacoes {

    public BigDecimal soma(BigDecimal valor){
        this.valor = valor;
        this.saldo = saldo;

        return saldo;
    }
}
