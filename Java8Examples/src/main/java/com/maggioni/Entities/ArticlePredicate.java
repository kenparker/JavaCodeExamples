package com.maggioni.Entities;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArticlePredicate {

    public static Predicate<Article> isAuthorEqual(String author) {
        return article -> article.getAuthor().equals(author);
    }

    public static Predicate<Article> isAuthorEmpty() {
        return article -> article.getAuthor().isEmpty();
    }

    public static Predicate<Article> isTagsEmpty() {
        return article -> article.getTags().isPresent();
    }

    public static Predicate<Article> isTagEqual(String tag) {
        return article -> article.getTags().isPresent()
                && article.getTags().get().contains(tag);
     }

    public static Predicate<Article> isAuthorAndTag(String author, String tag) {
        return isAuthorEqual(author).and(isTagEqual(tag));
    }

    public static List<Article> filterArticles(List<Article> articles, Predicate<Article> predicate) {
        return articles.stream().filter(predicate).collect(Collectors.toList());
    }
}
