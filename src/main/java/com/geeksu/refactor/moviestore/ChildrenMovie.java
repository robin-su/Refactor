package com.geeksu.refactor.moviestore;

class ChildrenMovie extends Movie {

    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public boolean isNewRelease() {
        return false;
    }

    @Override
    public Rental rental(int days) {
        return new ChildrenRental(this,days);
    }
}
