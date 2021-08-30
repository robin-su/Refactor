package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;

import java.util.Collection;

import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.sumX;
import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.sumY;

public class SummingStrategy implements IAggregationStrategy {
    public Measurement aggregate(Collection<Measurement> measurements) {
        return new Measurement(sumX(measurements),sumY(measurements));
    }
}
