package entities.domain.enums;

public enum NivelAcademico {
    PHD(1, "Técnico Superior"),
    MESTRADO(2, "Técnico Superior"),
    LICENCIATURA(3, "Técnico Superior"),
    BACHARELADO(4, "Técnico"),
    ENSINO_MEDIO(5, "Técnico Médio"),
    ENSINO_FUNDAMENTAL(6, "Técnico Básico");

    private final int valor;
    private final String descricao;

    NivelAcademico(int valor, String descricao) {
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
