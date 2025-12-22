public class SaferDivider {
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[1]);
        if (x2 == 0) {
            System.out.println("I can't divide by zero!");
        }
        else{
            System.out.println(x1/x2);
        }
    }
}
