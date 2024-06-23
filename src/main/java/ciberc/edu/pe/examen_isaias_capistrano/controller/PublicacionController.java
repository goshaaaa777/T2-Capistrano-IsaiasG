package ciberc.edu.pe.examen_isaias_capistrano.controller;


import java.util.List;

import ciberc.edu.pe.examen_isaias_capistrano.models.Publicacion;
import ciberc.edu.pe.examen_isaias_capistrano.service.PublicacionService;
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
@RequestMapping("/api/publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @PostMapping
    public ResponseEntity<Publicacion> createPublicacion(@RequestBody Publicacion publicacion) {
        Publicacion createdPublicacion = publicacionService.createPublicacion(publicacion);
        return ResponseEntity.ok(createdPublicacion);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Publicacion> updatePublicacion(@PathVariable Integer id, @RequestBody Publicacion publicacion) {
        Publicacion updatedPublicacion = publicacionService.updatePublicacion(id, publicacion);
        return updatedPublicacion != null ? ResponseEntity.ok(updatedPublicacion) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePublicacion(@PathVariable Integer id) {
        publicacionService.deletePublicacion(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Publicacion> getPublicacionById(@PathVariable Integer id) {
        Publicacion publicacion = publicacionService.getPublicacionById(id);
        return publicacion != null ? ResponseEntity.ok(publicacion) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Publicacion>> getAllPublicaciones() {
        List<Publicacion> publicaciones = publicacionService.getAllPublicaciones();
        return ResponseEntity.ok(publicaciones);
    }
}
