package com.jpaspringweb.jpa.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaspringweb.jpa.model.Books;
import com.jpaspringweb.jpa.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

  
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




    public Books findByBookId(int bookid){

        return bookRepository.findByBookid(bookid);
    }

    public List<Books> findAllBooks(){
        return  (List<Books>) bookRepository.findAll();

    }

    public void saveBook(Books book)
    {
        bookRepository.save(book);
        
    }
    
    public String updatePrice(int bookid , int amount){
        Books obj=bookRepository.findByBookid(bookid);
        System.out.println(obj.getPrice());
        
        obj.setPrice(obj.getPrice()+amount);
        System.out.println(obj.getPrice());
        bookRepository.save(obj);
        return "update amount success";   
    }
    

    public String deleteBook(int bookid)
    {   
        Books obj=bookRepository.findByBookid(bookid);
        System.out.println(obj);
        bookRepository.delete(obj);
        return "Success";
    }

    public List<Books> findByAuther(String auther)
    {
           List<Books> autherlst= bookRepository.findByAuthor(auther);
           return autherlst;

    }

    public List<Books> findByGenre(String genre)
    {
           List<Books> genrelst= bookRepository.findByGenre(genre);
           return genrelst;

    }

    public List<Books> findByPriceRange(int minprice ,int maxprice)
    {
        List<Books> pricelst = bookRepository.findByPriceBetween(minprice,maxprice);
        return pricelst;

    }
}

