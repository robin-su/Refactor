package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;

import java.util.Collection;

public interface IAggregationStrategy {
    Measurement aggregate(Collection<Measurement> measurements);
}
