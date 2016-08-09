package src;

import javafx.util.Pair;

import java.util.List;

/**
 * Created by jorge on 08-08-16.
 */
public abstract class TSPAlgorithm {

    public abstract double computeMinCycle(List<Pair<Double, Double>> points);
}
