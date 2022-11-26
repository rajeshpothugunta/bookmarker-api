package com.rajesh.bookmarkerapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null,"sivalabs1","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs2","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs3","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs4","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs5","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs6","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs7","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs8","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs9","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs10","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs11","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs12","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs13","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs14","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs15","https://sivalabs.com/", Instant.now()));
        repository.save(new Bookmark(null,"sivalabs16","https://sivalabs.com/", Instant.now()));

    }
}
