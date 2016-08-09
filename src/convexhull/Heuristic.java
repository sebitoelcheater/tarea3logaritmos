package convexhull;

import javafx.util.Pair;
import src.Point;
import src.TSPAlgorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jorge on 08-08-16.
 */
public class Heuristic extends TSPAlgorithm {

    private Point[] points;
    private int amplifier;

    public double computeMinCycle(List<Pair<Double, Double>> arrayPoints) {

        int n = arrayPoints.size();
        this.points = new Point[n];

        for (int i = 0; i < n; i++) {
            this.points[i].setX((int) (amplifier * arrayPoints.get(i).getKey()));
            this.points[i].setY((int) (amplifier * arrayPoints.get(i).getValue()));
        }

        Point[] convexHull = Point.findHull(points);

        for (int i = 0; i < n; i++) {

            int outside = -1;
            for (int j = 0; j < convexHull.length; j++)
                if ((int) (amplifier * arrayPoints.get(i).getKey()) == convexHull[j].getX() &&
                        (int) (amplifier * arrayPoints.get(i).getValue()) == convexHull[j].getY()) {
                    outside = i;
                }

            if (outside == -1) {

                int min1 = Integer.MAX_VALUE;
                int min2 = Integer.MAX_VALUE;
                for (int k = 0; k < convexHull.length; k++) {
                    for

                    }
                }
        }

    }

}
