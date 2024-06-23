package ciberc.edu.pe.examen_isaias_capistrano.service.impl;


import java.util.List;
import java.util.Optional;

import ciberc.edu.pe.examen_isaias_capistrano.models.Autor;
import ciberc.edu.pe.examen_isaias_capistrano.repository.AutorRepository;
import ciberc.edu.pe.examen_isaias_capistrano.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    @Override
    public Autor createAutor(Autor autor) {
        // TODO Auto-generated method stub
        return autorRepository.save(autor);
    }

    @Override
    public Autor updateAutor(Integer id, Autor autor) {
        Optional<Autor> optionalAutor = autorRepository.findById(id);
        if (optionalAutor.isPresent()) {
            Autor existingAutor = optionalAutor.get();
            existingAutor.setNomAutor(autor.getNomAutor());
            existingAutor.setApeAutor(autor.getApeAutor());
            existingAutor.setFechNacAutor(autor.getFechNacAutor());
            return autorRepository.save(existingAutor);
        }
        return null;
    }

    @Override
    public void deleteAutor(Integer id) {
        autorRepository.deleteById(id);

    }

    @Override
    public Autor getAutorById(Integer id) {
        // TODO Auto-generated method stub
        return autorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Autor> getAllAutores() {
        // TODO Auto-generated method stub
        return autorRepository.findAll();
    }

}
