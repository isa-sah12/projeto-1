package aulas.aula11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {

    public static void main(String[] args) {
        
        Musica m1 = new Musica(240, "Amor puro", "Djavan", 40, "pagode");
        Musica m2 = new Musica(320,"Love", "Johana", 60, "funk");
        Musica m3 = new Musica(580, "Carinho", "Isa", 59, "Sertanejo");

        List<Musica> lista = new ArrayList<>();
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);

        Playlist minhaPlaylist = new Playlist(320, "Minha playlist", true, 3, 159, LocalDateTime.now() , lista);

        System.out.println("***Playlist***");
        System.out.println("Id: "+ minhaPlaylist.id);
        System.out.println("Nome: "+ minhaPlaylist.nome);
        System.out.println("Publica: "+ minhaPlaylist.publica);
        System.out.println("Total de músicas: "+ minhaPlaylist.totalMusicas);
        System.out.println("Duração total de segundos: "+ minhaPlaylist.duracaoTotalSeg);
        System.out.println("Data de criação: "+ minhaPlaylist.dataCriacao);
        System.out.println("Lista de músicas: ");

        for (Musica music : minhaPlaylist.musicas) {
            System.out.println("Id: "+ music.id);
            System.out.println("Titulo: "+ music.titulo);
            System.out.println("Artista: "+ music.artista);
            System.out.println("Duração: "+ music.duracaoSeg);
            System.out.println("Genero: "+ music.genero);
        }

    }
    
}
