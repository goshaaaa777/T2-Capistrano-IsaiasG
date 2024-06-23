package ciberc.edu.pe.examen_isaias_capistrano.service.impl;


import java.util.List;
import java.util.Optional;

import ciberc.edu.pe.examen_isaias_capistrano.models.Publicacion;
import ciberc.edu.pe.examen_isaias_capistrano.repository.AutorRepository;
import ciberc.edu.pe.examen_isaias_capistrano.repository.PublicacionRepository;
import ciberc.edu.pe.examen_isaias_capistrano.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public Publicacion createPublicacion(Publicacion publicacion) {
        // TODO Auto-generated method stub
        return publicacionRepository.save(publicacion);
    }

    @Override
    public Publicacion updatePublicacion(Integer id, Publicacion publicacion) {
        Optional<Publicacion> optionalPublicacion = publicacionRepository.findById(id);
        if (optionalPublicacion.isPresent()) {
            Publicacion existingPublicacion = optionalPublicacion.get();
            existingPublicacion.setTitulo(publicacion.getTitulo());
            existingPublicacion.setResumen(publicacion.getResumen());
            existingPublicacion.setFechPublicacion(publicacion.getFechPublicacion());
            existingPublicacion.setAutor(publicacion.getAutor());
            return publicacionRepository.save(existingPublicacion);
        }
        return null;
    }

    @Override
    public void deletePublicacion(Integer id) {
        publicacionRepository.deleteById(id);

    }

    @Override
    public Publicacion getPublicacionById(Integer id) {
        // TODO Auto-generated method stub
        return publicacionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publicacion> getAllPublicaciones() {
        // TODO Auto-generated method stub
        return publicacionRepository.findAll();
    }

}
