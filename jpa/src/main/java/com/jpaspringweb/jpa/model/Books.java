package com.jpaspringweb.jpa.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "bookid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
     
    @NotBlank
    private String isbn;
    @NotBlank
    private String title;
    @NotBlank
    private String author;

    private String publisher;
    private Integer publicationYear;
    private String genre;
    private String description;
   
    private Integer pages;
    
    private Integer price;
    
    private String language;

}
