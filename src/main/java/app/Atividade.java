package app;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class abstract Atividade {
    private String descricao;

    public abstract String getDetalhes();
}
