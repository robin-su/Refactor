package com.geeksu.refactor.pattern.stragy;

import java.util.List;

public interface AgeFindStrategy {
    PersonAgeDiff find(List<Person> personList);
}
