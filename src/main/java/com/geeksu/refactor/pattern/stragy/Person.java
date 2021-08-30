package com.geeksu.refactor.pattern.stragy;

import java.util.Date;

public class Person {
    public String name;
    public Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public long ageDiffWith(Person other) {
        return birthDate.getTime() - other.getBirthDate().getTime();
    }
}
