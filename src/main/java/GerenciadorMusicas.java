import java.util.HashMap;
import java.util.Map;

class GerenciadorMusicas {
	private Map<String, Musica> musicas = new HashMap<>();

	public Musica getMusica(String titulo, String artista, String album) {
		String chave = titulo + artista;
		Musica musica = musicas.get(chave);

		if (musica == null) {
			musica = new MusicaDigital(titulo, artista, album);
			musicas.put(chave, musica);
		}

		return musica;
	}
}
