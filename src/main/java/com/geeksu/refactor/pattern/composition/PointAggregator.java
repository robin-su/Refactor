package com.geeksu.refactor.pattern.composition;

import com.geeksu.refactor.pattern.inheritance.Measurement;

import java.util.ArrayList;
import java.util.Collection;

public class PointAggregator {

    protected final Collection<Measurement> measurements;
    private final IMeasurementFilter filter;
    private final IAggregationStrategy aggregator;

    public PointAggregator(Collection<Measurement> measurements, IMeasurementFilter filter, IAggregationStrategy aggregator) {
        this.measurements = measurements;
        this.filter = filter;
        this.aggregator = aggregator;
    }

    public Measurement aggregate() {
        Collection<Measurement> local = new ArrayList<Measurement>(measurements);
        local = filter.filter(local);
        return aggregator.aggregate(local);
    }

    public static void main(String[] args) {
        Measurement measurement1 = new Measurement(100, 200);
        Measurement measurement2 = new Measurement(1, 2);
        Measurement measurement3 = new Measurement(100, 200);
        ArrayList<Measurement> measurements = new ArrayList<Measurement>();
        measurements.add(measurement1);
        measurements.add(measurement2);
        measurements.add(measurement3);

        PointAggregator aggregator = new PointAggregator(measurements, new EmptyFilter(), new AveragingStrategy());
        Measurement result = aggregator.aggregate();
        System.out.println(result.getX() + "->" + result.getY());

        PointAggregator aggregator1 = new PointAggregator(measurements, new LowerPassFilter(), new AveragingStrategy());
        Measurement result1 = aggregator1.aggregate();
        System.out.println(result1.getX() + "->"+ result1.getY());

        PointAggregator aggregator2 = new PointAggregator(measurements, new HighPassFilter(), new AveragingStrategy());
        Measurement result2 = aggregator2.aggregate();
        System.out.println(result2.getX() + "->"+ result2.getY());
    }
}
