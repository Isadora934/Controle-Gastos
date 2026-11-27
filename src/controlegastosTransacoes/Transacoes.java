package controlegastosTransacoes;
import java.math.BigDecimal;

public abstract class Transacoes{
    private static int contador = 0; //
    
    //protected para as clases filhas conseguirem acessar
    protected  int identificador;
    protected  String nomeTrans;
    protected  String descricao;
    protected  String data;
    protected  Categoria planoDeContas;
    protected  BigDecimal valor;

    protected Transacoes(String nome, String descricao, BigDecimal valor, Categoria categoria){
        //faltam as exceções, mas acho que isso pode ficar na classe de exceções
        contador++; //aqui contador recebe 1 toda vez que uma nova Transação é criada
        this.identificador = contador;
        this.nomeTrans = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.planoDeContas = categoria;
    }

    //apenas valor usa set, pois é o único que deve ser mudado

    public int getIdentificador() {
        return identificador;
    }
    public String getNome() {
        return nomeTrans;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getData() {
        return data;
    }
    void setValor(BigDecimal valor) { // unico atributo que pode ter seu valor alterado
        this.valor = valor;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void atualizar(BigDecimal valor){
        this.valor = valor;

    }
    
    public abstract BigDecimal calcularEfeitoSaldo();

}
