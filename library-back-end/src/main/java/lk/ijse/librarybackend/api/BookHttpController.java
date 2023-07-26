package lk.ijse.librarybackend.api;

import lk.ijse.librarybackend.dto.BookDTO;
import lk.ijse.librarybackend.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequestMapping("/api/v1/books")
@RestController
public class BookHttpController {

    private final BookService bookService;

    public BookHttpController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDTO> findAllBooks(@RequestParam(name = "q", required = false) String query) {
        if (query ==null) query = "";
        return bookService.findAllBooks(query);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody @Valid BookDTO bookDTO) {
bookService.saveBook(bookDTO);
    }
}
