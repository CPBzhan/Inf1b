public class Mode {
    public static void main(String[] args){
        int n = args.length;
        int[] dataset = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++){
            dataset[i] = Integer.parseInt(args[i]);
            count[dataset[i]] += 1;
        }
        int mode = 0;
        int cnt = 0;
        for (int i = 0; i <= 9; i++){
            if (count[i] >= cnt){
                cnt = count[i];
                mode = i;
            }
            System.out.printf("[%ds: %d]", i, count[i]);
            for (int j = 0; j < count[i]; j++){
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("Mode: " + mode);
    }
}
