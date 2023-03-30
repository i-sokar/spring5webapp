package repos;

import org.springframework.data.repository.CrudRepository;

import model.Author;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
