package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repos.AuthorRepo;
import guru.springframework.spring5webapp.repos.BookRepository;
import guru.springframework.spring5webapp.repos.PublisherRepo;
import org.springframework.stereotype.Component;

@Component
public class bootstarpData implements CommandLineRunner{


	private final AuthorRepo authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepo publisherRepository;

	public bootstarpData(AuthorRepo authorRepository, BookRepository bookRepository, PublisherRepo publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Started in Bootstrap");

		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setCity("St Petersburg");
		publisher.setState("FL");

		publisherRepository.save(publisher);

		System.out.println("Publisher Count: " + publisherRepository.count());

		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);

		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "3939459459");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);

		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);

		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
	}

}
