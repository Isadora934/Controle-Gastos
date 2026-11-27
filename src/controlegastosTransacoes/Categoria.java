package controlegastosTransacoes;
public class Categoria {

    private String nomeCat;
    private String tipo;

    public Categoria (String nomeCat, String tipo){
        this.nomeCat = nomeCat;
        this.tipo = tipo;
    }

    public String getNomeCat() {
        return nomeCat;
    }

    public String getTipo() {
        return tipo;
    }
}
