package lk.ijse.librarybackend.api;

import lk.ijse.librarybackend.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequestMapping("/api/v1/books")

public class BookHttpController {

    @GetMapping()
    public List<BookDTO> getAllBooks() {

        return null;
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody @Valid BookDTO bookDTO) {

    }
}
