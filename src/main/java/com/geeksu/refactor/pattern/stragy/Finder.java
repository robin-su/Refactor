package com.geeksu.refactor.pattern.stragy;

import java.util.List;

public class Finder {
    private final List<Person> personList;
    private AgeFindStrategy findStrategy;

    public Finder(List<Person> p,AgeFindStrategy findStrategy ) {
        personList = p;
        this.findStrategy = findStrategy;
    }

    public PersonAgeDiff find() {
        return findStrategy.find(personList);
    }

}
