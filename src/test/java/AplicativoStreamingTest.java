import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicativoStreamingTest {

	@Test
	void deveReproduzirMusicas() {
		AplicativoStreaming app = new AplicativoStreaming();

		// Reproduzindo músicas e salvando na String
		String saida = "";
		saida += app.reproduzirMusica("Shape of You", "Ed Sheeran", "Divide");
		saida += app.reproduzirMusica("Believer", "Imagine Dragons", "Evolve");
		saida += app.reproduzirMusica("Shape of You", "Ed Sheeran", "Divide");
		saida += app.reproduzirMusica("Havana", "Camila Cabello", "Camila");
		saida += app.reproduzirMusica("Believer", "Imagine Dragons", "Evolve");

		// Lista esperada de saída
		String saidaEsperada =
			"Reproduzindo música: Shape of You - Ed Sheeran (Divide)\n" +
				"Reproduzindo música: Believer - Imagine Dragons (Evolve)\n" +
				"Reproduzindo música: Shape of You - Ed Sheeran (Divide)\n" +
				"Reproduzindo música: Havana - Camila Cabello (Camila)\n" +
				"Reproduzindo música: Believer - Imagine Dragons (Evolve)\n";

		// Verifica se a saída esperada corresponde ao que foi reproduzido
		assertEquals(saidaEsperada, saida);
	}

	@Test
	void deveContarReproducoes() {
		AplicativoStreaming app = new AplicativoStreaming();

		// Reproduzindo músicas
		app.reproduzirMusica("Shape of You", "Ed Sheeran", "Divide");
		app.reproduzirMusica("Believer", "Imagine Dragons", "Evolve");
		app.reproduzirMusica("Shape of You", "Ed Sheeran", "Divide");
		app.reproduzirMusica("Havana", "Camila Cabello", "Camila");
		app.reproduzirMusica("Believer", "Imagine Dragons", "Evolve");

		// Verifica se as músicas foram reproduzidas corretamente
		assertEquals(2, app.getQuantidadeReproducoes("Shape of You", "Ed Sheeran"));
		assertEquals(2, app.getQuantidadeReproducoes("Believer", "Imagine Dragons"));
		assertEquals(1, app.getQuantidadeReproducoes("Havana", "Camila Cabello"));
		assertEquals(0, app.getQuantidadeReproducoes("Musica Nula", "Artista Nulo"));
	}
}

