package estruturais.adapter.paypal;

import estruturais.adapter.utils.Token;

public class PayPal implements IPayPalPagamentos {
    private Token token;

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPagamento() {
        this.token = getToken();
        System.out.println("Enviando pagamento com Paypal");
    }

    @Override
    public void paypalRecebimento() {
        System.out.println("Recebendo pagamento com Paypal");
    }
}
