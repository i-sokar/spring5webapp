package guru.springframework.spring5webapp.repos;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Author;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
