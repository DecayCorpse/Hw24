import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set your name : ");
        String s = scanner.nextLine();
        User Ivan = new User();
        User Petya = (User)Ivan.clone();
        System.out.println("Set your age : ");
        Petya.setAge(scanner.nextInt());
        Petya.setUserName(s);



        System.out.println(Ivan);
        System.out.println(Ivan.hashCode());
        System.out.println("===================================");
        System.out.println(Petya);
        System.out.println(Petya.hashCode());
        System.out.println(Ivan.equals(Petya));
    }
}
