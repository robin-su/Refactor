package com.geeksu.refactor.moviestore;

abstract class Rental {
    protected Movie movie;
    protected int daysRented;
    protected double thisAmount = 0;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public abstract double account();

    public boolean isBonus() {
        return movie.isNewRelease() && daysRented > 3;
    }

    public String statement() {
        return "\t" + movie.getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }
}
