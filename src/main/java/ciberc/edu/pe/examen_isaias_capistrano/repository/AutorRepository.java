
package ciberc.edu.pe.examen_isaias_capistrano.repository;

import ciberc.edu.pe.examen_isaias_capistrano.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
