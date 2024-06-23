package ciberc.edu.pe.examen_isaias_capistrano.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/validacion")
public class SubirArchivosValidacionesController {
    private static final long MAX_FILE_SIZE = 25 * 1024 * 1024; // 25MB

    @PostMapping("/uploadSingle")
    public ResponseEntity<String> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        if (file.getSize() > MAX_FILE_SIZE) {
            return new ResponseEntity<>("File size exceeds the maximum limit of 25MB.", HttpStatus.BAD_REQUEST);
        }

        // Logic to save file
        return new ResponseEntity<>("File uploaded successfully.", HttpStatus.OK);
    }
}
