package ciberc.edu.pe.examen_isaias_capistrano.models;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
//@Data
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;

    @Column(nullable = false, length = 250)
    private String titulo;

    @Column(nullable = false, length = 250)
    private String resumen;

    @Column(nullable = false)
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idAutor", nullable = false)
    private Autor autor;

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
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

    public Date getFechPublicacion() {
        return fechPublicacion;
    }

    public void setFechPublicacion(Date fechPublicacion) {
        this.fechPublicacion = fechPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }



}
