class MusicaDigital implements Musica {
	private String titulo;
	private String artista;
	private String album;

	public MusicaDigital(String titulo, String artista, String album) {
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
	}

	@Override
	public String reproduzir() {
		return "Reproduzindo música: " + titulo + " - " + artista + " (" + album + ")\n";
	}
}
