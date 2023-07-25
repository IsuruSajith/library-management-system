package lk.ijse.librarybackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO implements Serializable {
    @NotBlank(message = "isbn cannot be empty")
    String isbn;

    @NotBlank(message = "title cannot be empty")
    String title;

}
