package com.libraryManagementSystem.Services;

import com.libraryManagementSystem.Model.Library;

public interface LibraryServices {
    public Library addBook(Library library);
    public Library updateBook(Library library);
    public Library getBook(int id);
    public void deleteBook(int id);
}
