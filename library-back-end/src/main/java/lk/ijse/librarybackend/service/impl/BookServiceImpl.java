package lk.ijse.librarybackend.service.impl;

import lk.ijse.librarybackend.dto.BookDTO;
import lk.ijse.librarybackend.entity.Book;
import lk.ijse.librarybackend.entity.SupperEntity;
import lk.ijse.librarybackend.repository.BookRepository;
import lk.ijse.librarybackend.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper mapper;

    public BookServiceImpl(BookRepository bookRepository, ModelMapper mapper) {
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    @Override
    public void saveBook(BookDTO book) {
        bookRepository.save(mapper.map(book, Book.class));
    }

    @Override
    public List<BookDTO> findAllBooks(String query) {
        query = "%" + query + "%";
        return bookRepository.findBooksByIsbnLikeOrTitleLike(query, query)
                .stream().map(book -> mapper.map(book, BookDTO.class)).collect(Collectors.toList());
    }
}
