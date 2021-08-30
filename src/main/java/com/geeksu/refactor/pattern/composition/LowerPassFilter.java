package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;
import com.geeksu.refactor.pattern.inheritance.MeasurementUtils;

import java.util.Collection;

public class LowerPassFilter implements IMeasurementFilter{
    public Collection<Measurement> filter(Collection<Measurement> measurements) {
        return MeasurementUtils.wherelessThanXandY(measurements,100,100);
    }
}
