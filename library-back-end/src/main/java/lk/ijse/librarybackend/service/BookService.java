package lk.ijse.librarybackend.service;

import lk.ijse.librarybackend.dto.BookDTO;
import lk.ijse.librarybackend.entity.SupperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BookService {

    void saveBook(BookDTO book);

    List<BookDTO> findAllBooks(String query);

}

