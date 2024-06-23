package ciberc.edu.pe.examen_isaias_capistrano.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/files")
public class SubirArchivosController {
    private static final List<String> ALLOWED_EXTENSIONS = Arrays.asList("pdf", "png", "docx");

    @PostMapping("/uploadMultiple")
    public ResponseEntity<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        if (files.length != 3) {
            return new ResponseEntity<>("Please upload exactly 3 files.", HttpStatus.BAD_REQUEST);
        }

        for (MultipartFile file : files) {
            String extension = getFileExtension(file.getOriginalFilename());
            if (!ALLOWED_EXTENSIONS.contains(extension)) {
                return new ResponseEntity<>("Invalid file extension for file: " + file.getOriginalFilename(), HttpStatus.BAD_REQUEST);
            }
        }

        // Logic to save files
        return new ResponseEntity<>("Files uploaded successfully.", HttpStatus.OK);
    }

    private String getFileExtension(String filename) {
        if (filename == null || filename.isEmpty()) {
            return "";
        }
        return filename.substring(filename.lastIndexOf('.') + 1).toLowerCase();
    }
}
