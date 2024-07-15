import java.util.HashMap;
import java.util.Map;

public class AplicativoStreaming {

	private GerenciadorMusicas gerenciador = new GerenciadorMusicas();
	private Map<String, Integer> contadorReproducoes = new HashMap<>();

	public String reproduzirMusica(String titulo, String artista, String album) {
		Musica musica = gerenciador.getMusica(titulo, artista, album);

		String chave = titulo + artista;
		contadorReproducoes.put(chave, contadorReproducoes.getOrDefault(chave, 0) + 1);
		return musica.reproduzir();
	}

	public int getQuantidadeReproducoes(String titulo, String artista) {
		String chave = titulo + artista;
		return contadorReproducoes.getOrDefault(chave, 0);
	}

}