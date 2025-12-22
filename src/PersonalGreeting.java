public class PersonalGreeting {
    public static void main(String[] args){
        String first_name = args[0];
        String last_name = args[1];
        String name = first_name + last_name;
        System.out.println("Your name is: " + name);
    }
}