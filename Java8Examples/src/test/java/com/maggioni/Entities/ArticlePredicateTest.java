package com.maggioni.Entities;

import org.junit.Test;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class ArticlePredicateTest extends ArticleTest{

    @Test
    public void testPopulateArticlesList() {
        Integer expected = 5;
        Integer numberOfArticles = articles.size();
        assertEquals(expected,numberOfArticles);
    }

    @Test
    public void testSelectAuthor() {
        String authorToSearch = "Argento";
        Integer expected = 1;
        List<Article> authors = ArticlePredicate.filterArticles(articles, ArticlePredicate.isAuthorEqual(authorToSearch));
        Integer size = authors.size();
        assertEquals(expected, size);
        Predicate<Article> predicate = ArticlePredicate.isAuthorEmpty().negate().and(ArticlePredicate.isAuthorEqual(authorToSearch));
        authors = ArticlePredicate.filterArticles(articles, predicate);
        size = authors.size();
        assertEquals(expected,size);
    }

    @Test
    public void testSelectAuthorNoAuthorsfound() {
        String authorToSearch = "Argento";
        Integer expected = 0;
        List<Article> authors = ArticlePredicate.filterArticles(articles, ArticlePredicate.isAuthorEmpty().and(ArticlePredicate.isAuthorEqual(authorToSearch)));
        Integer size = authors.size();
        assertEquals(expected, size);
    }

    @Test
    public void testTags() {
        List<Article> tags = ArticlePredicate.filterArticles(articles, ArticlePredicate.isTagEqual("Horror"));
        assertEquals((Integer) 3, (Integer) tags.size());
    }

    @Test
    public void testAuthorAndTag() {
        List<Article> tags = ArticlePredicate.filterArticles(articles, ArticlePredicate.isAuthorAndTag("Zitty", "Horror"));
        assertEquals((Integer) 1, (Integer) tags.size());
    }
}