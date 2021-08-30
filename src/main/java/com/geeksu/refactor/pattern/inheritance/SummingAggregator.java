package com.geeksu.refactor.pattern.inheritance;

import java.util.Collection;

import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.sumX;
import static com.geeksu.refactor.pattern.inheritance.MeasurementUtils.sumY;

/**
 * 求和操作
 */
public class SummingAggregator extends PointAggregator {

    public SummingAggregator(Collection<Measurement> measurements) {
        super(measurements);
    }

    @Override
    protected Collection<Measurement> filterMeasurements() {
        return measurements;
    }

    /**
     * 将坐标轴x和y加起来，得到一个新的测量点
     *
     * @return
     */
    @Override
    protected Measurement aggregateMeasurements() {
        return new Measurement(sumX(measurements),sumY(measurements));
    }

}
