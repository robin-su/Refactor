package com.geeksu.refactor.pattern.inheritance;

import java.util.Collection;

/**
 * 先过滤出制定的x,y在做平均，也就是不对所有的x,y都做平均
 */
public class LowPassAveragingAggregator extends AveragingAggregator {

    public LowPassAveragingAggregator(Collection<Measurement> measurements) {
        super(measurements);
    }

    /**
     * 找出(x,y) < (100,100)的点再去求平均
     *
     * @return
     */
    protected Collection<Measurement> filterMeasurements() {
        return MeasurementUtils.wherelessThanXandY(measurements,100,100);
    }


}
