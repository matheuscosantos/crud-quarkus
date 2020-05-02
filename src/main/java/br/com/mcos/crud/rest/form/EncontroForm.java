package br.com.mcos.crud.rest.form;

public class EncontroForm {
	
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public EncontroForm(String titulo) {
		super();
		this.titulo = titulo;
	}

	public EncontroForm() {
		super();
	}

	@Override
	public String toString() {
		return "EncontroForm [titulo=" + titulo + "]";
	}	
	
	

}
