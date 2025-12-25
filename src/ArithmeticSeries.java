public class ArithmeticSeries {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int ans = 0;
        while (num > 0){
            ans += num;
            num--;
        }
        System.out.println(ans);
    }
}
