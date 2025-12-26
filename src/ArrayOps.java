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
        int n = data.length;
        double[] arr = new double[n];
        for (int i = n - 1; i >= 0; i--){
            arr[n - i - 1] = data[i];
        }
        return arr;
    }

    public static void reverseInPlace(double[] data) {
        int n = data.length;
        int left = 0;
        int right = n - 1;
        double tmp;
        while (left < right){
            tmp = data[left];
            data[left] = data[right];
            data[right] = tmp;
            left++;
            right--;
        }
    }

    public static void swap(double[] data1, double[] data2) {
        double[] tmp = new double[data1.length];
        tmp = data1;
        data1 = data2;
        data2 = tmp;
    }

}