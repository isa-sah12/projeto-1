package aulas.aula1508teste;

import java.util.UUID;

public class Placar {
    UUID id;
    int golsMandante;
    int golVisitante;

    public Placar () {}

    public Placar (UUID id, int golsMandante, int golVisitante) {
        this.id = id;
        this.golsMandante = golsMandante;
        this.golVisitante = golVisitante;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    
}
