package org.example.exemplos;

public enum TipoValor {

    CONTA_POUPANCA(2),
    CONTA_CORRENTE(1),
    CONTA_PAGAMENTO(3);

    private Integer valor;

    //O construtor de um enum tem que ser private!!!
    private TipoValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return this.valor;
    }

    /*
    //O método abaixo foi criado para que seja possível informar um valor e obter o tipo da conta corrente.
    public static TipoValor valueOf(int code) {
        for (TipoValor value : TipoValor.values()) {
            if (value.getValor() == code) {
                return value;
            }
        }
        return null;
    }

     */
}

