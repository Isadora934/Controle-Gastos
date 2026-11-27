import java.math.BigDecimal;
import java.util.*;
import controlegastosTransacoes.*;

public class TesteTransacoes {
    public static void main(String[] args) {
        //criandoCategorias
        Categoria catSalario = new Categoria("Salários", "RECEITA");
        Categoria catLuz = new Categoria("Luz", "DESPESA");
        Categoria catMercado = new Categoria("Alimentação", "DESPESA");

        //criando transações
        Transacoes t1 = new Receita("EMPRESA", "SALARIO MENSAL", new BigDecimal("3500.00"), catSalario);
        Transacoes t2 = new Despesa("CONTA DE LUZ", "-", new BigDecimal("80.00"), catLuz);
        Transacoes t3 = new Despesa("SUPERMERCADO", "COMPRAS DA SEMANA", new BigDecimal("420.00"), catMercado);

        //guardando em uma lista (polimorfismo de inclusão)
        List<Transacoes> extrato = new ArrayList<>();
        extrato.add(t1);
        extrato.add(t2);
        extrato.add(t3);

        //exibindo o extrato e calculando saldo inicial (polimorfismo de sobrecarga)
        System.out.println("EXTRATO");
        BigDecimal saldo = BigDecimal.ZERO; //saldo inicial zero
        for(Transacoes t : extrato){
            System.out.println(t); //chama o tostring especifico
            saldo = saldo.add(t.calcularEfeitoSaldo());
        }
        System.out.println("Saldo total: R$ " + saldo);


    }
}
