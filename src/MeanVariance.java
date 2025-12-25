public class MeanVariance {
    public static void main(String[] args){
        int n = args.length;
        double[] nums = new double[n];
        for (int i = 0; i < n; i++){
            nums[i] = Double.parseDouble(args[i]);
        }
        double mean = 0;
        double vars = 0;
        for (int i = 0; i < n; i++){
            mean += nums[i];
        }
        mean /= n;
        for (int i = 0; i < n; i++){
            vars += (nums[i] - mean) * (nums[i] - mean);
        }
        vars /= n;
        System.out.println(mean);
        System.out.println(vars);
    }
}
