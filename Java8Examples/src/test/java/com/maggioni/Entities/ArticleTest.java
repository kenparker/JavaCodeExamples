package com.maggioni.Entities;

import org.junit.Before;

import java.util.Arrays;
import java.util.List;

public class ArticleTest {

    public List<String> authors = Arrays.asList(new String[]{"Argento", "Zig"});
    public List<String> ISBNs = Arrays.asList(new String[]{"A0001", "Z001", "TATA1"});
    ArticlePopulateData articlesPopulate;
    List<Article> articles;

    @Before
    public void setup() {
        articlesPopulate = new ArticlePopulateData(authors, ISBNs);
        articles = articlesPopulate.populate();
    }
}
