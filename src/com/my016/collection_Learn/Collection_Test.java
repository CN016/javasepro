package com.my016.collection_Learn;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Test {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《nt》",9.9,"00"));
        movies.add(new Movie("《sb》",2.9,"01"));
        movies.add(new Movie("《fw》",9.6,"02"));
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
