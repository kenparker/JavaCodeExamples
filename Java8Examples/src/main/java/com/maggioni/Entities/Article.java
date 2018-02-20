package com.maggioni.Entities;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Article {

    private String ISBN;
    private String author;
    private Optional<List<String>> tags;

    public Article() {
    }

    public Article(String ISBN, String author) {
        this.ISBN = ISBN;
        this.author = author;
        tags = Optional.empty();
    }

    public Article(String ISBN, String author, List<String> tags) {
        this.ISBN = ISBN;
        this.author = author;
        this.tags = Optional.ofNullable(tags);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Optional<List<String>> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = Optional.of(tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(ISBN, article.ISBN);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ISBN);
    }
}
