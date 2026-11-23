package brcomtrabalhoFinalusuario; 
import java.math.BigDecimal;

public class Conta {
    private String titular;
    private BigDecimal saldo;

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() { // Mesma função do consultar saldo (:
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }   

    
}
