package lista08.q1;

public class Livro {
	private Autor autor;
	private Editora editora;
	private final String ISBN;
	private String titulo, anoDeEdicao;

	public Livro(Autor autor, Editora editora, String ISBN, String titulo, String anoDeEdicao){
		setAutor(autor);
		setEditora(editora);
		this.ISBN = ISBN;
		setTitulo(titulo);
		setAnoDeEdicao(anoDeEdicao);
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoDeEdicao() {
		return anoDeEdicao;
	}

	public void setAnoDeEdicao(String anoDeEdicao) {
		this.anoDeEdicao = anoDeEdicao;
	}

}
