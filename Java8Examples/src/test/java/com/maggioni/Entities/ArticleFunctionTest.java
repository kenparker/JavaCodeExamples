package com.maggioni.Entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.maggioni.Entities.ArticleFunction.filterAuthor;
import static com.maggioni.Entities.ArticleFunction.sortByAuthor;
import static org.junit.Assert.*;

public class ArticleFunctionTest extends ArticleTest {

    @Test
    public void testFilterByAuthor() {
        List<Article> articlesFiltered = filterAuthor.apply(authors.get(0), articles);
        assertTrue(articlesFiltered.size()==1);
        assertEquals(authors.get(0),articlesFiltered.get(0).getAuthor());
    }

    @Test
    public void testSortByAuthor() {
        System.out.println("davor : " + articles);
        List<Article> articlesByAuthor = sortByAuthor.apply(articles);
        String firstAuthor = articlesByAuthor.get(0).getAuthor();
        String lastAuthor = articlesByAuthor.get(articlesByAuthor.size() - 1).getAuthor();
        System.out.println("danach : " + articlesByAuthor);
        assertEquals(authors.get(0),firstAuthor);
        assertEquals(authors.get(1),lastAuthor);
    }

}