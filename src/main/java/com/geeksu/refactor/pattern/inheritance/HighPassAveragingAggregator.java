package com.geeksu.refactor.pattern.inheritance;

import java.util.Collection;

/**
 * 继承带来负担很重，继承带来了不必要的功能继承，比如说本类多了聚合的功能
 * 不满足单一职责。
 */
public class HighPassAveragingAggregator extends SummingAggregator{

    public HighPassAveragingAggregator(Collection<Measurement> measurements) {
        super(measurements);
    }

    @Override
    protected Collection<Measurement> filterMeasurements() {
        return MeasurementUtils.whereMoreThanXandY(measurements,2,2);
    }
}
