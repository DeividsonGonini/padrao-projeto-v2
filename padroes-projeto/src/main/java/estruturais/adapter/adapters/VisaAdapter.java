package estruturais.adapter.adapters;

import estruturais.adapter.paypal.IPayPalPagamentos;
import estruturais.adapter.utils.Token;
import estruturais.adapter.visa.Visa;

public class VisaAdapter implements IPayPalPagamentos {
    private Visa visa;

    public VisaAdapter(Visa visa) {
        this.visa = visa;
        System.out.println("Adaptando o Visa utilizando os metodos padroes do PayPall");
    }

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPagamento() {
        this.visa.visaPagamentos();
    }

    @Override
    public void paypalRecebimento() {
        this.visa.visaRecebimentos();
    }
}

