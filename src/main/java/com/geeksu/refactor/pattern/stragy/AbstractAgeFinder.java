package com.geeksu.refactor.pattern.stragy;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAgeFinder implements AgeFindStrategy {

    public final PersonAgeDiff find(List<Person> personList) {
        ArrayList<PersonAgeDiff> ageDiffList = new ArrayList<PersonAgeDiff>();
        for (int i = 0; i < personList.size() - 1; i++) {
            for (int j = i + 1; j < personList.size(); j++) {
                PersonAgeDiff ageDiff = new PersonAgeDiff();
                if(personList.get(i).ageDiffWith(personList.get(j)) < 0) {
                    ageDiff.person1 = personList.get(i);
                    ageDiff.person2 = personList.get(j);
                } else {
                    ageDiff.person1 = personList.get(j);
                    ageDiff.person2 = personList.get(i);
                }
                ageDiff.calcAgeDiff();
                ageDiffList.add(ageDiff);
            }
        }
        if(ageDiffList.size() < 1) {
            return new PersonAgeDiff();
        }
        PersonAgeDiff answer = ageDiffList.get(0);
        for (PersonAgeDiff result : ageDiffList) {
            if(compareDiff(answer, result)) {
                answer = result;
            }
        }
        return answer;
    }

    protected abstract boolean compareDiff(PersonAgeDiff answer, PersonAgeDiff result);

}
