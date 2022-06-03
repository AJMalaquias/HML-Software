package entities.domain.enums;

public enum Carreira {
    MEDICA(1, "Médica"),
    ENFERMAGEM(2, "Enfermagem"),
    DIAGNOSTICA_E_TERAPEUTICA(3, "Diagnóstica e Terapêutica"),
    REGIME_GERAL(4, "Regime Geral"),
    APOIO_HOSPITALAR(5, "Apoio Hospitalar"),
    TRABALHADOR_SOCIAL(6, "Trabalhador Social");

    private final int valor;
    private final String descricao;

    Carreira(int valor, String descricao) {
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
