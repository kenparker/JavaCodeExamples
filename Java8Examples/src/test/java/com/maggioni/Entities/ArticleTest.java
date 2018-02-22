package com.maggioni.Entities;

import org.junit.Before;

import java.util.Arrays;
import java.util.List;

public class ArticleTest {

    public List<String> authors = Arrays.asList(new String[]{"Argento", "Zig"});
    ArticlePopulateData articlesPopulate;
    List<Article> articles;

    @Before
    public void setup() {
        articlesPopulate = new ArticlePopulateData(authors);
        articles = articlesPopulate.populate();
    }
}
