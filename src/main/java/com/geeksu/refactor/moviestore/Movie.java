package com.geeksu.refactor.moviestore;

abstract class Movie {

    protected String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract boolean isNewRelease();

    public abstract Rental rental(int days);
}
