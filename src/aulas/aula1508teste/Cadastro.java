package aulas.aula1508teste;

import java.util.ArrayList;
import java.util.UUID;

public class Cadastro {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.setId(UUID.randomUUID());
        jogador1.setCpf("099.206.725-13");
        jogador1.setNome("Isabela Sabrina");
        jogador1.setNumero("4");
        jogador1.setPosicao("Volante");

        Jogador jogador2 = new Jogador();
        jogador2.setId(UUID.randomUUID());
        jogador2.setCpf("099.345.678-95");
        jogador2.setNome("Stefany Lohane");
        jogador2.setNumero("6");
        jogador2.setPosicao("Atacante");

        ArrayList ListaDeJogadores = new ArrayList<>();
        ListaDeJogadores.add(jogador1);
        ListaDeJogadores.add(jogador2);

        Time timeMandante = new Time();
        timeMandante.setId(UUID.randomUUID());
        timeMandante.setNome("Flamengo");
        timeMandante.setJogadores(ListaDeJogadores);

        Time timeVisitante = new Time();
        timeVisitante.setId(UUID.randomUUID());
        timeVisitante.setNome("Vasco");
        timeVisitante.setJogadores(ListaDeJogadores);

        Arbitro arbitro = new Arbitro();
        arbitro.setId(UUID.randomUUID());
        arbitro.setNome("Maria Paula");
        arbitro.setFifa(false);
        arbitro.setCodigo("1234567");


        System.out.println("ID jogador: " + jogador1.getId());
    }
    
}
