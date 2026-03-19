package com.devsenior.libreria_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devsenior.libreria_api.models.Libro;

@Service
public class LibroService {

    private final List<Libro> libros = List.of(
            new Libro(1L, "Clean Code", "Robert C. Martin", 2008, "Tecnología"),

            new Libro(2L, "El Señor de los Anillos", "J.R.R. Tolkien", 1954, "Fantasía"),

            new Libro(3L, "Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico"),

            new Libro(4L, "Spring in Action", "Craig Walls", 2022, "Tecnología"));

    public List<Libro> obtenerTodos() {
        return libros;
    }

    public Optional<Libro> obtenerPorId(Long id) {
        return libros.stream().filter(l -> l.id().equals(id)).findFirst();
    }
}
