package bootstrap;

import org.springframework.boot.CommandLineRunner;

import model.Author;
import model.Book;
import repos.AuthorRepo;
import repos.BookRepo;

public class bootstarpData implements CommandLineRunner{


	private final AuthorRepo authorrepo;
	private final BookRepo bookrepo;
	

	
	public bootstarpData(AuthorRepo authorrepo, BookRepo bookrepo) {
		super();
		this.authorrepo = authorrepo;
		this.bookrepo = bookrepo;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
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
		
	}

}
