package cs252;

import java.util.Arrays;

/**
 * Class to compute median averages.
 * 
 * The median average of a sequence of numbers is the "middle" value
 * if you have an odd number of values or the midpoint between the two middle
 * values if you have an even number of values.
 */
public class Median {

    double[] values;

    public Median(double[] values) {
        this.values = values;
    }

    /**
     * Compute the median average of the supplied values.
     * @return the median average
     */
    double median() {
        double[] sorted = Arrays.copyOf(values, values.length); // More efficient array copy
        Arrays.sort(sorted); // Corrected the spelling here
        int middle = values.length / 2;
        if (values.length % 2 == 0) {
            // Corrected to access the correct middle elements
            return 0.5 * (sorted[middle - 1] + sorted[middle]);
        } else {
            return sorted[middle];
        }
    }
}
