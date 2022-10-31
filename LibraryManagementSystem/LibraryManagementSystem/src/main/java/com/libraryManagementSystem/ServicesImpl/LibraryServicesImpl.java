package com.libraryManagementSystem.ServicesImpl;

import com.libraryManagementSystem.Model.Library;
import com.libraryManagementSystem.Services.LibraryServices;
import com.libraryManagementSystem.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServicesImpl  implements LibraryServices {

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public Library addBook(Library library) {
        return this.libraryRepository.save(library);
    }

    @Override
    public Library updateBook(Library library) {
        return this.libraryRepository.save(library);
    }

    @Override
    public Library getBook(int id) {
        return this.libraryRepository.findById(id);
    }

    @Override
    public void deleteBook(int id) {
        this.libraryRepository.deleteById(id);
    }


}
