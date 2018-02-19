package com.maggioni.Entities;

import java.util.List;

interface ArticleFactory<P extends Article> {
    P create(String ISBN, String author, List<String> tags);
}
