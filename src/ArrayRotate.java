public class ArrayRotate {
    public static void main(String[] args){
        int n = args.length;
        int[] nums = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < n - 1; i++){
            copy[i] = nums[i+1];
        }
        copy[n-1] = nums[0];
        for (int i = 0; i < n; i++){
            System.out.print(copy[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
