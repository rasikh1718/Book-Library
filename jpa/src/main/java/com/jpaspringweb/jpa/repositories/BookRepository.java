package com.jpaspringweb.jpa.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpaspringweb.jpa.model.Books;


@Repository
public interface BookRepository extends CrudRepository<Books,Integer>{
   Books findByBookid(Integer bookid);
   List<Books> findByGenre(String genre);
   List<Books> findByAuthor(String author);
   List<Books> findByPriceBetween(int minprice, int maxprice);
   
   
   
    
}
