package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;

import java.util.Collection;

/**
 * 什么都不做
 */
public class EmptyFilter implements IMeasurementFilter{
    public Collection<Measurement> filter(Collection<Measurement> measurements) {
        return measurements;
    }
}
