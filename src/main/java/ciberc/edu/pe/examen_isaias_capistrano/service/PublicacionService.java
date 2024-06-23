package ciberc.edu.pe.examen_isaias_capistrano.service;

import ciberc.edu.pe.examen_isaias_capistrano.models.Publicacion;

import java.util.List;




public interface PublicacionService {
    Publicacion createPublicacion(Publicacion publicacion);
    Publicacion updatePublicacion(Integer id, Publicacion publicacion);
    void deletePublicacion(Integer id);
    Publicacion getPublicacionById(Integer id);
    List<Publicacion> getAllPublicaciones();
}
