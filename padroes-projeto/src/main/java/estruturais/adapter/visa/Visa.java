package estruturais.adapter.visa;

import estruturais.adapter.utils.Token;

public class Visa implements IVisa {
    private Token token;

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void visaPagamentos() {
        this.token = getToken();
        System.out.println("Enviando pagamento com Visa");
    }

    @Override
    public void visaRecebimentos() {
        System.out.println("Recebendo pagamento com Visa");

    }
}
