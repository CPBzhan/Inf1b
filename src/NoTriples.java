public class NoTriples {
    public static boolean noTriples(int[] nums){
        int n = nums.length;
        if (n < 3) return true;
        for (int i = 0; i < n - 3; i++){
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        boolean exp1 = noTriples(new int[]{1, 1, 2, 2, 1});
        boolean exp2 = noTriples(new int[]{1, 1, 2, 2, 2, 1});
        boolean exp3 = noTriples(new int[]{1, 1, 1, 2, 2, 2, 1});
        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);

    }
}
