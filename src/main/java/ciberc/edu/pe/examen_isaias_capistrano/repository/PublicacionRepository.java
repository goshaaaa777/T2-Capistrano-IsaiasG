package ciberc.edu.pe.examen_isaias_capistrano.repository;

import ciberc.edu.pe.examen_isaias_capistrano.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicacionRepository  extends JpaRepository<Publicacion, Integer>{

}
