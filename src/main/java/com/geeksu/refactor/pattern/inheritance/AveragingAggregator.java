package com.geeksu.refactor.pattern.inheritance;

import java.util.Collection;

import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.averageX;
import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.averageY;

/**
 * 求平均值
 *
 */
public class AveragingAggregator extends PointAggregator{

    public AveragingAggregator(Collection<Measurement> measurements) {
        super(measurements);
    }

    protected Collection<Measurement> filterMeasurements() {
        return measurements;
    }

    protected Measurement aggregateMeasurements() {
        return new Measurement(averageX(measurements),averageY(measurements));
    }


}
