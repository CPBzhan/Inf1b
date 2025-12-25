public class ArrayOps {
    public static double findMax(double[] data) {
        int n = data.length;
        double maxn = 0;
        for (double datum : data) {
            if (datum > maxn) maxn = datum;
        }
        return maxn;
    }

    public static double[] normalise(double[] data) {
        double sum = 0;
        int n = data.length;
        for (double datum : data) {
            sum += datum;
        }
        double[] newdata = new double [n];
        for (int i = 0; i < n; i++){
            newdata[i] = data[i] / sum;
        }
        return newdata;
    }

    public static void normaliseInPlace(double[] data) {
        double sum = 0;
        for (double datum : data) {
            sum += datum;
        }
        for (int i = 0; i < data.length; i++){
            data[i] /= sum;
        }
    }

    public static double[] reverse(double[] data) {
        // ADD CODE HERE
    }

    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE
    }

    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
    }

}