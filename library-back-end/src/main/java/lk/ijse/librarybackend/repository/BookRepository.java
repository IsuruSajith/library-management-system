package lk.ijse.librarybackend.repository;

import lk.ijse.librarybackend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,String> {
    List<Book> findBooksByIsbnLikeOrTitleLike(String q1, String q2);

}
