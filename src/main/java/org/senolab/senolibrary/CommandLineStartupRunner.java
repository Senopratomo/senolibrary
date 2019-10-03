package org.senolab.senolibrary;


import org.senolab.senolibrary.model.Book;
import org.senolab.senolibrary.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineStartupRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommandLineStartupRunner.class);

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String...args) throws Exception {
        bookRepository.deleteAll();

        bookRepository.save(new Book((long) 1, "Bruce Eckel","Thinking in Java"));
        bookRepository.save(new Book((long) 2, "Joshua Bloch","Effective Java"));
        bookRepository.save(new Book((long) 3, "Vaskaran Sarcar","Java Design Pattern"));

    }
}
