package com.libraryManagementSystem.Repository;

import com.libraryManagementSystem.Model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    public Library findById(int id);
}
