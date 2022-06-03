package entities.domain.enums;

public enum Sexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private final int valor;
    private final String descricao;

    Sexo(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
