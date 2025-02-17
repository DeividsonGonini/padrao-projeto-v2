package estruturais.adapter.mercadopago;

import estruturais.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPagamentos {

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void enviaPagamento() {
        System.out.println("Enviando pagamentos com Mercado Pago");
    }

    @Override
    public void recebePagamento() {
        System.out.println("Recebendo pagamentos com Mercado Pago");
    }
}
