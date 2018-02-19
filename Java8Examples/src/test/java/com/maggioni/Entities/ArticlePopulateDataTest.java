package com.maggioni.Entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArticlePopulateDataTest {

    ArticlePopulateData articles = new ArticlePopulateData();

    @Test
    public void populate() {
        Integer expected = 2;
        Integer numberOfArticles = articles.populate().size();
        assertEquals(expected,numberOfArticles);
    }
}