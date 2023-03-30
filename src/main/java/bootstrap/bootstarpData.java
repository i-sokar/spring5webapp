package bootstrap;

import org.springframework.boot.CommandLineRunner;

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
		
	}

}
