package speedControl;

import java.util.Arrays;

public class GpsSpeed {
    public static int gps(int s, double[] x) {

        if (s < 2 || x.length < 1) return 0;

        double[] resArr = new double[x.length - 1];

        for (int i = 0; i < x.length - 1; i++) {
            resArr[i] = Math.abs((3600 * (x[i] - x[i  + 1])) / s);
        }

        return (int) Arrays.stream(resArr).max().orElse(0);
    }

}
