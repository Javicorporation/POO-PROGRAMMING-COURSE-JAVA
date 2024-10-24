package com.proyecto03.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Libros")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "book_seq_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                '}';
    }
}
