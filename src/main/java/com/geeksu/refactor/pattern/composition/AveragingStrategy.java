package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;
import com.geeksu.refactor.pattern.inheritance.MeasurementUtils;

import java.util.Collection;

public class AveragingStrategy implements IAggregationStrategy{
    public Measurement aggregate(Collection<Measurement> measurements) {
        return new Measurement(MeasurementUtils.averageX(measurements),MeasurementUtils.averageY(measurements));
    }
}
