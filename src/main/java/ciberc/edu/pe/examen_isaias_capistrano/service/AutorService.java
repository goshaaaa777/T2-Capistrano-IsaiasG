package ciberc.edu.pe.examen_isaias_capistrano.service;

import ciberc.edu.pe.examen_isaias_capistrano.models.Autor;

import java.util.List;





public interface AutorService {
    Autor createAutor(Autor autor);
    Autor updateAutor(Integer id, Autor autor);
    void deleteAutor(Integer id);
    Autor getAutorById(Integer id);
    List<Autor> getAllAutores();
}
