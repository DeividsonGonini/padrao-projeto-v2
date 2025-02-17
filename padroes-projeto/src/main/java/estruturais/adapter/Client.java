package estruturais.adapter;

import estruturais.adapter.adapters.MercadoPagoAdapter;
import estruturais.adapter.adapters.VisaAdapter;
import estruturais.adapter.mercadopago.MercadoPago;
import estruturais.adapter.paypal.IPayPalPagamentos;
import estruturais.adapter.paypal.PayPal;
import estruturais.adapter.visa.Visa;

import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        IPayPalPagamentos paypalPagamentos;

        String metodoPagamento  = JOptionPane.showInputDialog(""
                + "Digite uma das opções abaixo de pagamento:\n"
                + "- paypal\n" + "- mercadopago\n" + "- visa");;

        switch (metodoPagamento) {
            case "paypal": {
                paypalPagamentos = new PayPal();
                break;
            }
            case "mercadopago": {
                paypalPagamentos = new MercadoPagoAdapter(new MercadoPago());
                break;
            }
            case "visa": {
                paypalPagamentos = new VisaAdapter(new Visa());
                break;
            }
            default:
                throw new IllegalArgumentException("Metodo de pagamento inválido: " + metodoPagamento);
        }

//      após a inclusão dos adapters esses métodos não foram alterados
        paypalPagamentos.paypalPagamento();
        paypalPagamentos.paypalRecebimento();
    }
}
