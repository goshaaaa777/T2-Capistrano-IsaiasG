package ciberc.edu.pe.examen_isaias_capistrano.controller;


import java.util.List;

import ciberc.edu.pe.examen_isaias_capistrano.models.Autor;
import ciberc.edu.pe.examen_isaias_capistrano.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/autores")
public class AutorController {


    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor) {
        Autor createdAutor = autorService.createAutor(autor);
        return ResponseEntity.ok(createdAutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@PathVariable Integer id, @RequestBody Autor autor) {
        Autor updatedAutor = autorService.updateAutor(id, autor);
        return updatedAutor != null ? ResponseEntity.ok(updatedAutor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAutor(@PathVariable Integer id) {
        autorService.deleteAutor(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutorById(@PathVariable Integer id) {
        Autor autor = autorService.getAutorById(id);
        return autor != null ? ResponseEntity.ok(autor) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Autor>> getAllAutores() {
        List<Autor> autores = autorService.getAllAutores();
        return ResponseEntity.ok(autores);
    }
}
