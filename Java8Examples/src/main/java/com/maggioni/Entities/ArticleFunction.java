package com.maggioni.Entities;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArticleFunction {

    public static BiFunction<String, List<Article>, List<Article>> filterAuthor = (author, articles) -> articles.stream()
            .filter(ArticlePredicate.isAuthorEqual(author))
            .collect(Collectors.toList());

    public static BiFunction<String, List<Article>, List<Article>> filterTag = (tag, articles) -> articles.stream()
            .filter(ArticlePredicate.isTagEqual(tag))
            .collect(Collectors.toList());

    private static Comparator<Article> comparatorByISBN = Comparator.comparing(Article::getISBN);
    private static Comparator<Article> comparatorByISBNReversed = comparatorByISBN.reversed();
    private static Comparator<Article> comparatorByAuthor = (Article a1, Article a2) -> a1.getAuthor().compareTo(a2.getAuthor());

    public static Function<List<Article>, List<Article>> sortByISBN = articles -> articles.stream()
            .sorted(comparatorByISBN)
            .collect(Collectors.toList());

    public static Function<List<Article>, List<Article>> sortByISBNReversed = articles -> articles.stream()
            .sorted(comparatorByISBNReversed)
            .collect(Collectors.toList());

    public static Function<List<Article>, List<Article>> sortByAuthor = articles -> articles.stream()
            .sorted(comparatorByAuthor)
            .collect(Collectors.toList());
}
