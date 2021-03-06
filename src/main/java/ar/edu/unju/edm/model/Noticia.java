package ar.edu.unju.edm.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Noticia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer idNoticia;
	@Column
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fecha;
	@Column
	private String titulo;
	@Column
	private String resumen;

	
	public Noticia() {
		// TODO Auto-generated constructor stub
	}


	public Noticia(Integer idNoticia, LocalDate fecha, String titulo,
			String resumen) {
		super();
		this.idNoticia = idNoticia;
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}


	public Integer getIdNoticia() {
		return idNoticia;
	}


	public void setIdNoticia(Integer idNoticia) {
		this.idNoticia = idNoticia;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result
				+ ((idNoticia == null) ? 0 : idNoticia.hashCode());
		result = prime * result + ((resumen == null) ? 0 : resumen.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idNoticia == null) {
			if (other.idNoticia != null)
				return false;
		} else if (!idNoticia.equals(other.idNoticia))
			return false;
		if (resumen == null) {
			if (other.resumen != null)
				return false;
		} else if (!resumen.equals(other.resumen))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Noticia [idNoticia=" + idNoticia + ", fecha=" + fecha
				+ ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	


}
