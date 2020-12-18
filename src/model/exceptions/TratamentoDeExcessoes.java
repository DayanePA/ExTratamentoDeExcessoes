package model.exceptions;

public class TratamentoDeExcessoes extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TratamentoDeExcessoes(String mensagem) {
        super(mensagem);
    }
}
