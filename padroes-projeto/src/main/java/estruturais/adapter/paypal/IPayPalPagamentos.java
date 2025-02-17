package estruturais.adapter.paypal;

import estruturais.adapter.utils.Token;

public interface IPayPalPagamentos {
    Token getToken();
    void paypalPagamento();
    void paypalRecebimento();
}
