package com.geeksu.refactor.moviestore;

class NewReleaseRented extends Rental {

    public NewReleaseRented(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double account() {
        return thisAmount += daysRented * 3;
    }
}
