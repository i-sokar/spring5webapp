package guru.springframework.spring5webapp.repos;
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Integer> {

}
