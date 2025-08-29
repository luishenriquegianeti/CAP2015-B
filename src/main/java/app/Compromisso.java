package app;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compromisso {

    private Calendar dataInicial;
    private Calendar dataFinal;

    public Compromisso(String descricao, Calendar dataInicial, Calendar dataFinal){
        this.setDescricao(descricao);
        this.setDataInicial(dataInicial);
        this.setDataFinal(dataFinal);
        );
    }

    @Override
    public String getDetalhes() {
        return this.getDescricao() + "(" + this.getDataInicial().getTime() + ")";
    }
}
