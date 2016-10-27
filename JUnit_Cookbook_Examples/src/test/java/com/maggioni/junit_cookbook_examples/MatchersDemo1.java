package com.maggioni.junit_cookbook_examples;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatchersDemo1 {

    @Test
    public void matcherIsDemo1() {
        String s = "Hello";      
        assertThat("Hello", CoreMatchers.is(s));
    }
    
    @Test
    public void matcherIsDemo2() {
        Integer integer = 101010;
        assertThat(101010, CoreMatchers.is(integer));
    }
    
    @Test
    public void matcherIsNotDemo1() {
        Integer integer1111 = 1111;
        assertThat(1110, CoreMatchers.not(integer1111));
    }
    
    @Test
    public void matcherIsNotDemo2() {
        Integer integer1111 = 1111;
        assertThat(1111, CoreMatchers.not(integer1111));
    }
    
}
