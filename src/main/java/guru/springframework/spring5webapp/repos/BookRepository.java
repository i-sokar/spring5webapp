package guru.springframework.spring5webapp.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
