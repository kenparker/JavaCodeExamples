package com.maggioni.Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticlePopulateData {

    public ArticleFactory<Article> articleFactory = Article::new;

    public List<Article> populate() {
        List<Article> articles = new ArrayList<>();
        articles.add(articleFactory.create("ABTS11", "Zig", Arrays.asList("Politic", "Thriller")));
        articles.add(articleFactory.create("BTSGA11", "Argento", Arrays.asList("Horror")));
        articles.add(articleFactory.create("TATA12", "Zitty", Arrays.asList("Emotions","Horror","West")));
        articles.add(articleFactory.create("NHTS1345", "Pally", Arrays.asList("Koko","Horror","West")));
        articles.add(articleFactory.create("MAMSE1344", "Tip", null));
        return articles;
    }
}
