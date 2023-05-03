package guru.springframework.spring5webapp.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
