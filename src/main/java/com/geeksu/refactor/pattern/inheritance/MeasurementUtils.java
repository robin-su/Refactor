package com.geeksu.refactor.pattern.inheritance;

import java.util.ArrayList;
import java.util.Collection;

public class MeasurementUtils {

    public static final int averageX(Collection<Measurement> measurements) {
        int total = 0;
        for (Measurement i : measurements) {
            total += i.getX();
        }
        return measurements.size() == 0 ? 0 : total / measurements.size();
    }

    public static final int averageY(Collection<Measurement> measurements) {
        int total = 0;
        for (Measurement i : measurements) {
            total += i.getY();
        }
        return measurements.size() == 0 ? 0 : total / measurements.size();
    }

    public static final int sumX(Collection<Measurement> measurements) {
        int total = 0;
        for (Measurement i : measurements) {
            total += i.getX();
        }
        return total;
    }

    public static final int sumY(Collection<Measurement> measurements) {
        int total = 0;
        for (Measurement i : measurements) {
            total += i.getY();
        }
        return total;
    }

    public static Collection<Measurement> wherelessThanXandY(Collection<Measurement> measurements,int x,int y) {
        Collection<Measurement> lessThan = new ArrayList<Measurement>();
        for (Measurement m : measurements) {
            if(m.getX() < x && m.getY() < y) {
                lessThan.add(m);
            }
        }
        return lessThan;
    }

    public static Collection<Measurement> whereMoreThanXandY(Collection<Measurement> measurements,int x,int y) {
        Collection<Measurement> lessThan = new ArrayList<Measurement>();
        for (Measurement m : measurements) {
            if(m.getX() > x && m.getY() > y) {
                lessThan.add(m);
            }
        }
        return lessThan;
    }
}
