package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Aluno {
    private long id;
    private String nome;
    private int idade;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
}
