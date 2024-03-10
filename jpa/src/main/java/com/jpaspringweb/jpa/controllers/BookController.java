package com.jpaspringweb.jpa.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jpaspringweb.jpa.model.Books;

import com.jpaspringweb.jpa.services.BookService;







@Controller
public class BookController {
    
    @Autowired
    private BookService bookService;
    
 
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/home")
    public String home(){
        return "index.jsp";
    }
    
    @GetMapping("/allbooks")
    public ModelAndView allBookList(){
         List<Books> allbook=bookService.findAllBooks();
         ModelAndView mv = new ModelAndView();
         mv.setViewName("ShowAllBooks.jsp");
         mv.addObject("allbook", allbook);
         System.out.println("number of book retrieved : "+allbook.size());
     
        return mv;
        
    }

    @GetMapping("/addbook")
	public String newAccount()
	{
		return "newbook.jsp";
	} 

    @PostMapping("/addnewbook")
    public String addBookToLibrary(Books book){
       
        bookService.saveBook(book);
        System.out.println("new book added succuessfully");
		return "BookAdded.jsp";
        
    }

    @GetMapping("/updatebookprice")
    public String updateprice()
   {
    return "NewPriceFormPage.jsp";
   }

   @PostMapping("/priceamount")
   public String addAmountToBook(int bookid,int amount )
   {
     bookService.updatePrice(bookid, amount);
     return "bookPriceUpdateSuccesfull.jsp";
   }
    
   @GetMapping("/delete")
    public String deletebook(){
        
        return "Deletebook.jsp";
    }
   
    @PostMapping("deletebook")
    public String deleteBookFromLib(int bookid)
    {
        bookService.deleteBook(bookid);
        return "DeleteSuccess.jsp";
    }
   
      
   @PostMapping("/searchauthor")
   public ModelAndView searchAuther(String author){
       ModelAndView mv=new ModelAndView();
       List<Books> listobj = bookService.findByAuther(author);
       System.out.println(listobj.size());
       mv.addObject("listobj", listobj);
       mv.setViewName("searchonAuther.jsp");
      return mv;  
   }
  
   @GetMapping("/SearchonGenre")
   public String searchonGenre()
   {
    return"Genreform.jsp";
   }
    
        
   @PostMapping("/GenreSearch")
   public ModelAndView GenreSearch(String genre){
       ModelAndView mv=new ModelAndView();
       List<Books> listobj = bookService.findByGenre(genre);
       System.out.println(listobj.size());
       mv.addObject("listobj", listobj);
       mv.setViewName("searchonGenre.jsp");
      return mv;  
   }
   
   @GetMapping("/PriceRange")
   public String PriceRange()
   {
    return"PriceRangeForm.jsp";
   }
    

   @PostMapping("/PriceRangeSearch")
    public ModelAndView PriceRangeSearch(@RequestParam("minprice") int minprice,@RequestParam("mixprice") int maxprice)
    {
        ModelAndView mv=new ModelAndView();
        List<Books> listobj = bookService.findByPriceRange(minprice, maxprice);
        System.out.println(listobj.size());
        mv.addObject("listobj", listobj);
        mv.setViewName("ShowPriceRangeSearch.jsp");
       return mv;
      

   }
}

   
       
   
   
    
   

