package com.lynnlyk.spring.core.ioc.di.setter_based;

public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on the MovieFinder
    private MovieFinder movieFinder;

    // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    public MovieFinder getMovieFinder() {
        return movieFinder;
    }


    // business logic that actually uses the injected MovieFinder is omitted...
}
