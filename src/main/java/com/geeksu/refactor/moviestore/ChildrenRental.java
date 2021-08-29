package com.geeksu.refactor.moviestore;

class ChildrenRental extends Rental {
    public ChildrenRental(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @Override
    public double account() {
        thisAmount += 1.5;
        if(daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
