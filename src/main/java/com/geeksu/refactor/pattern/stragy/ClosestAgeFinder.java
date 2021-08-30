package com.geeksu.refactor.pattern.stragy;

public class ClosestAgeFinder extends AbstractAgeFinder {

    protected boolean compareDiff(PersonAgeDiff answer, PersonAgeDiff result) {
        return result.ageDiff < answer.ageDiff;
    }

}
