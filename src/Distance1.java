public class Distance1 {
    public static void main(String[] args){
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        System.out.println(Math.max(A, B) - Math.min(A, B));
    }
}