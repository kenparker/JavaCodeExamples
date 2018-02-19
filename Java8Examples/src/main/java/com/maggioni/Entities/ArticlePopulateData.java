package com.maggioni.Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticlePopulateData {

    ArticleFactory<Article> articleFactory = Article::new;

    public List<Article> populate() {
        List<Article> articles = new ArrayList<>();
        articles.add(articleFactory.create("ABTS11", "Zig", Arrays.asList("Politic", "Thriller")));
        articles.add(articleFactory.create("BTSGA11", "Argento", Arrays.asList("Horror")));
        return articles;
    }
}
