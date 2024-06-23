package ciberc.edu.pe.examen_isaias_capistrano.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
//@Data
@Table(name = "Autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;


    @Column(nullable = false, length = 50)
    private String nomAutor;

    @Column(nullable = false, length = 50)
    private String apeAutor;

    @Column(nullable = false)
    private LocalDate fechNacAutor;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApeAutor() {
        return apeAutor;
    }

    public void setApeAutor(String apeAutor) {
        this.apeAutor = apeAutor;
    }

    public LocalDate getFechNacAutor() {
        return fechNacAutor;
    }

    public void setFechNacAutor(LocalDate fechNacAutor) {
        this.fechNacAutor = fechNacAutor;
    }


}
