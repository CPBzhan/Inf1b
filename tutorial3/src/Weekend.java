import java.util.Scanner;
public class Weekend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toUpperCase();
        int k = sc.nextInt();
        int n = -1;
        switch (day){
            case "MONDAY" -> n = 1;
            case "TUESDAY" -> n = 2;
            case "WEDNESDAY" -> n = 3;
            case "THURSDAY" -> n = 4;
            case "FRIDAY" -> n = 5;
            case "SATURDAY" -> n = 6;
            case "SUNDAY" -> n = 7;
        }
        if (n + k == 6 || n + k == 7){
            System.out.println("WEEKEND!");
        }
        else System.out.println("Not weekend yet...");
    }
}
