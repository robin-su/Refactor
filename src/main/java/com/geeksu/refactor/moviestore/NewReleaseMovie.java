package com.geeksu.refactor.moviestore;

public class NewReleaseMovie extends Movie{

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public boolean isNewRelease() {
        return true;
    }

    @Override
    public Rental rental(int days) {
        return new NewReleaseRented(this, days);
    }
}
