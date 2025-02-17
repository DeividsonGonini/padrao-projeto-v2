package estruturais.adapter.visa;

import estruturais.adapter.utils.Token;

public interface IVisa {
    Token getToken();
    void visaPagamentos();
    void visaRecebimentos();

}
