package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;

import java.util.Collection;

public interface IMeasurementFilter {

    Collection<Measurement> filter(Collection<Measurement> measurements);

}
