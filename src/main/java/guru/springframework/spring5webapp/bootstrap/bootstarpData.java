package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repos.AuthorRepo;
import guru.springframework.spring5webapp.repos.BookRepo;
import guru.springframework.spring5webapp.repos.PublisherRepo;

public class bootstarpData implements CommandLineRunner{


	private final AuthorRepo authorrepo;
	private final BookRepo bookrepo;
	private final PublisherRepo prepo;
	

	
	public bootstarpData(AuthorRepo authorrepo, BookRepo bookrepo, PublisherRepo prepo) {
		super();
		this.authorrepo = authorrepo;
		this.bookrepo = bookrepo;
		this.prepo = prepo;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		Author ismail= new Author("ismail","sokar");
		Book bkk= new Book("hello", "21651");
		ismail.getBooks().add(bkk);
		bkk.getAuthors().add(ismail);
		authorrepo.save(ismail);
		bookrepo.save(bkk);
		
		Author skr = new Author("hello","skr");
		Book bok = new Book("ddd","5646");
		skr.getBooks().add(bok);
		bok.getAuthors().add(skr);
		
		authorrepo.save(skr);
		bookrepo.save(bok);
		System.out.println("bootstrap");
		System.out.println("number of books"+bookrepo.count());
		Publisher pp = new Publisher( "ismail sokar", "maadi ", "cairo", "cairo", "545664");
		prepo.save(pp);
		System.out.println(pp.toString());
		
		bkk.setPulisher(pp);
		pp.getBooks().add(bok);
		prepo.save(pp);
		bok.setPulisher(pp);
		pp.getBooks().add(bkk);
		prepo.save(pp);
		System.out.println(prepo.count());
		
	}

}
