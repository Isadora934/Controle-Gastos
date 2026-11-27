package controlegastosTransacoes;

import java.math.BigDecimal;

public class Receita extends Transacoes {

    public Receita(String nome, String descricao, BigDecimal valor, Categoria categoria){
        super(nome, descricao, valor, categoria); //super() pega as informações do construtor pai (Transacoes)
    }

    @Override //polomorfismo de sobrescrita
    public BigDecimal calcularEfeitoSaldo(){
        return this.valor;
    }


    //padronizar extrato, sem isso, as linhas podem ficar tortas
    @Override 
    public String toString(){
        return String.format("%4d RECEITA %-25s %-15s +%10.2f",
            identificador, nomeTrans, planoDeContas.getNomeCat(), valor);
        
    }

    //o String.format formata como a String será mostrada no extrato, ele reserva, também, um espaço na memória para o seu correspondete. Exemplo:
    //%2d -> %2 reserva dois espaços de memória à direita; d -> decimal integer (int); referencia identificador
    // %-25 -> %-25 alinha o texto à esquerda, reserva 25 espaços na mémoria; s -> String; referencia nomeTrans
}
