package com.maggioni.Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticlePopulateData {

    public List<String> authors;
    public List<String> ISBN;
    public ArticleFactory<Article> articleFactory = Article::new;

    public ArticlePopulateData(List<String> authors, List<String> ISBN) {
        this.authors = authors;
        this.ISBN = ISBN;
    }

    public List<Article> populate() {
        List<Article> articles = new ArrayList<>();
        articles.add(articleFactory.create(ISBN.get(2), authors.get(1), Arrays.asList("Politic", "Thriller")));
        articles.add(articleFactory.create("BTSGA11", authors.get(0), Arrays.asList("Horror")));
        articles.add(articleFactory.create(ISBN.get(0), "Zatty", Arrays.asList("Emotions","Horror","West")));
        articles.add(articleFactory.create("NHTS1345", "Pally", Arrays.asList("Koko","Horror","West")));
        articles.add(articleFactory.create(ISBN.get(1), "Tip", null));
        return articles;
    }
}
