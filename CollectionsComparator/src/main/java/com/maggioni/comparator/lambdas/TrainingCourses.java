package com.maggioni.comparator.lambdas;

import java.math.BigDecimal;

/**
 *
 * @author magang
 */
class  TrainingCourses {

    private final String title;
    private final BigDecimal price;

    public TrainingCourses(String title, BigDecimal price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TrainingCourses{" + "title=" + title + ", price=" + price + '}';
    }
    
    
}
