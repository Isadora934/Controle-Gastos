import java.math.BigDecimal;

public class Transacoes{
    private int identificador;
    private String nomeTrans;
    private String descricao;
    private String data;
    private planoDeContas Categoria;
    private BigDecimal valor;
    private BigDecimal saldo;

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setNome(String nome) {
        this.nomeTrans = nome;
    }
    public String getNome() {
        return nomeTrans;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }

    protected void inserir(BigDecimal novoValor){
            //tem que fazer o método né
    }

    protected void atualizar(BigDecimal novoValor){
        //tem que fazer né kkk
    }

    protected void remover(String nomeTrans){
        //tem que fazer kkk
    }

}
