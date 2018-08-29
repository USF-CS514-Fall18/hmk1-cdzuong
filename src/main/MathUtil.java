package main;

/**
 * A class that contains a couple of useful mathematical
 * functions.
 * You may NOT modify method names, parameters, return types.
 * Add your code only where the comment asks you
 * to replace with your own code.
 */
public class MathUtil {
    public final static double EPS = 0.01;

    /**
     * Computes the distance between two points
     * defined by (x1, y1) and (x2, y2).
     * Use the distance formula from this source:
     * https://www.purplemath.com/modules/distform.htm
     *
     * @param x1 x coordinate of the first point
     * @param y1 y coordinate of the first point
     * @param x2 x coordinate of the second point
     * @param y2 y coordinate of the second point
     * @return distance between two points
     */
    public static double computeDistance(int x1, int y1, int x2, int y2) {
        //TODO: Replace with your code.

        int length = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        double distance = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));

        return distance;
    }

    /**
     * Computes a sum of terms 1.0/2^i, where i
     * goes from 1 to n (inclusive).
     *
     * @param n the number of terms to include in the summation
     * @return the sum of the geometric series
     */
    public static double computeGeomSeries(int n) {
        //TODO: Replace with your code.
        double sum = 0.0;

        for (int x = 1; x <= n; x++) {
            sum += 1.0 / Math.pow(2, x);
        }


        return sum;
    }

    /**
     * Do not change this code. This is used to check
     * if your answer is correct
     *
     * @param methodName  the name of the method being tested
     * @param studentRes  result computed by your program
     * @param expectedRes result that was expected
     * @return true if student's result matches expected result,
     * false otherwise.
     */
    public static boolean compareResults(String methodName,
                                         double studentRes,
                                         double expectedRes) {
        if (Math.abs(studentRes - expectedRes) > EPS) {
            System.out.println("Sorry, incorrect result in " + methodName);
            System.out.println("Expected: " + expectedRes);
            System.out.println("Your code returned: " + studentRes);
            System.out.println("----------------------------------");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("------Checking class MathUtil------- ");
        // Check if computeDistance is correct
        double res1 = MathUtil.computeDistance(10, 10, 20, 30);
        double res2 = MathUtil.computeDistance(-100, 0, 10, -5);
        //System.out.println(res1 + " " + res2);
        double expectedRes1 = 22.36;
        double expectedRes2 = 110.113;

        boolean testDist1 = MathUtil.compareResults("computeDistance", res1, expectedRes1);
        boolean testDist2 = MathUtil.compareResults("computeDistance", res2, expectedRes2);
        if (testDist1 && testDist2)
            System.out.println("computeDistance seems to work correctly.");
        System.out.println();

        // Check if computeGeomSeries is correct
        res1 = MathUtil.computeGeomSeries(3);
        res2 = MathUtil.computeGeomSeries(6);
        expectedRes1 = 0.875;
        expectedRes2 = 0.984375;
        //System.out.println(res1 + " " + res2);
        boolean testGeomSeries1 = MathUtil.compareResults("computeGeomSeries", res1, expectedRes1);
        boolean testGeomSeries2 = MathUtil.compareResults("computeGeomSeries", res2, expectedRes2);
        if (testGeomSeries1 && testGeomSeries2)
            System.out.println("computeGeomSeries seems to work correctly.");

    }

}
