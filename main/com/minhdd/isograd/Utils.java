package com.minhdd.isograd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by admin on 26/03/2016.
 */
public class Utils {
    public static double[] getDoubleArray(String firstLine, int n) {
        double[] doubles = Arrays.asList(firstLine.split(" ")).stream().mapToDouble(Double::valueOf).toArray();
        if (doubles.length == n) {
            return doubles;
        } else {
            return null;
        }
    }
}
