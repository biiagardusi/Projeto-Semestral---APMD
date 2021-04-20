
public class Filme {
	private boolean assistido;
	
	private String titulo;
	private String sinopse;
	private String genero;
	private int avaliacao;
	private String ondeAssisstir;
	
	public boolean isAssistido() {
		return assistido;
	}
	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getOndeAssisstir() {
		return ondeAssisstir;
	}
	public void setOndeAssisstir(String ondeAssisstir) {
		this.ondeAssisstir = ondeAssisstir;
	}
	@Override
	public String toString() {
		return "Filme [assistido=" + assistido + ", titulo=" + titulo + ", sinopse=" + sinopse + ", genero=" + genero
				+ ", avaliacao=" + avaliacao + ", ondeAssisstir=" + ondeAssisstir + "]";
	}
	
	

}
