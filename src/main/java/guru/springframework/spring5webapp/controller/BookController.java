package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repos.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepo repo;

    public BookController(BookRepo repo) {
        this.repo = repo;
    }
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",repo.findAll());
        return"books/list";

    }


}
