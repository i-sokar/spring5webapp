package repos;

import org.springframework.data.repository.CrudRepository;

import model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
