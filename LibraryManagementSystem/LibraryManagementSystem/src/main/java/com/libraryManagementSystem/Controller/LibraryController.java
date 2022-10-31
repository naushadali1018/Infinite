package com.libraryManagementSystem.Controller;

import com.libraryManagementSystem.Exception.HndBookException;
import com.libraryManagementSystem.Model.Library;
import com.libraryManagementSystem.ServicesImpl.LibraryServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

    @Autowired
    private LibraryServicesImpl libraryServices;

    @PostMapping("/addbook")
    public Library addBook(@RequestBody Library book){
        return this. libraryServices.addBook(book);
    }

    @PutMapping("/updatebook")
    public Library updateBook(@RequestBody Library book){
        return this. libraryServices.updateBook(book);
    }
    @GetMapping("/getbook/{id}")
    public Library getBook(@PathVariable("id") int id){
        return this. libraryServices.getBook(id);
    }

    @DeleteMapping("/deletebook/{id}")
    public void deleteBook(@PathVariable("id") int id) throws HndBookException {
        Library book=this. libraryServices.getBook(id);
        if(book==null){
            throw new HndBookException("Service.BOOK_NOT_FOUND");
        }else
            this. libraryServices.deleteBook(id);
    }
}
