package estruturais.adapter.adapters;

import estruturais.adapter.mercadopago.MercadoPago;
import estruturais.adapter.paypal.IPayPalPagamentos;
import estruturais.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPagamentos {
private MercadoPago mercadoPago;

public MercadoPagoAdapter(MercadoPago mercadoPago){
    this.mercadoPago = mercadoPago;
    System.out.println("Adaptando o Mercado Pago utilizando os metodos padroes do PayPall");
}

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPagamento() {
    this.mercadoPago.enviaPagamento();
    }

    @Override
    public void paypalRecebimento() {
    this.mercadoPago.recebePagamento();
    }
}
