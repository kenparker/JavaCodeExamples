package com.maggioni.Entities;

import org.junit.Before;

import java.util.List;

public class ArticleTest {

    ArticlePopulateData articlesPopulate;
    List<Article> articles;

    @Before
    public void setup() {
        articlesPopulate = new ArticlePopulateData();
        articles = articlesPopulate.populate();
    }
}
