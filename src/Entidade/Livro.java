package Entidade;

public class Livro {
	
	// Atirbutos de Livro
	
	private String titulo;
	private String autor;
	private String isbn;
	private int ano;
	private boolean disponivel;
	
	// Metodos gets e Sets
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("Título Inválido!!");
		}
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		// Validação de ano: ano >= 1000 e <= 2026
		if(ano >= 1000 && ano <= 2026) {
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("Ano Inválido !!");
		}
		
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(String disponivel) {
	    if(!disponivel.equals("true") && !disponivel.equals("false")) {
	        throw new IllegalArgumentException("Valor inválido para disponível!");
	    }
	    this.disponivel = Boolean.parseBoolean(disponivel);
	}
		
	
	
	

	public Livro(String titulo, String autor, String isbn, int ano, String disponivel) {
		super();
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setIsbn(isbn);
		this.setAno(ano);
		this.setDisponivel(disponivel);
	}
	
	public void emprestar () {
		this.disponivel = false;
	}
	
	public void devolver () {
		this.disponivel = false;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", ano=" + ano + ", disponivel="
				+ disponivel + "]";
	}
	
	
	

}
