package com.geeksu.refactor.pattern.inheritance;

import java.util.Collection;

public abstract class  PointAggregator {

    protected abstract Collection<Measurement> filterMeasurements();
    protected abstract Measurement aggregateMeasurements();
    // 要做操作的点
    protected Collection<Measurement> measurements;

    public PointAggregator(Collection<Measurement> measurements) {
        this.measurements = measurements;
    }

    /**
     * 1.过滤出（x,y）
     * 2.进行聚合操作
     *
     * @return
     */
    public Measurement aggregate() {
        measurements = filterMeasurements();
        return aggregateMeasurements();
    }
}
