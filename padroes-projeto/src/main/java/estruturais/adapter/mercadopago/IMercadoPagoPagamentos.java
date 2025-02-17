package estruturais.adapter.mercadopago;

import estruturais.adapter.utils.Token;

public interface IMercadoPagoPagamentos {
    Token getToken();
    void enviaPagamento();
    void recebePagamento();

}
