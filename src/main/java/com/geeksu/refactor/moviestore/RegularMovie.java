package com.geeksu.refactor.moviestore;

public class RegularMovie extends Movie{

    public RegularMovie(String title) {
        super(title);
    }

    public boolean isNewRelease() {
        return false;
    }

    @Override
    public Rental rental(int days) {
        return new RegularRental(this,days);
    }
}
