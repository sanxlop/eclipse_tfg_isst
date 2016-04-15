package es.upm.dit.isst.t4.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TFG implements Serializable {

	private static final long serialVersionUID = 01L;
	
	@Id
	private String autor;
	private String titulo;
	private String resumen;
	private String tutor;
	
	public TFG (String autor, String titulo, String resumen, String tutor) {
		this.setAutor(autor);
		this.setTitulo(titulo);
		this.setResumen(resumen);
		this.setTutor(tutor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
