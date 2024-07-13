package lecture4.classwork.ex1;

import java.util.Scanner;

public class CheckLoginPass {
    public static void main(String[] args) {
        String login = "King";
        String password = "pass";

        System.out.print("Enter your login: ");
        Scanner sc = new Scanner(System.in);
        String userLogin = sc.next();

        if (login.equals(userLogin)){
            System.out.print("Enter your password: ");
            String userPass = sc.next();
            if (password.equals(userPass)){
                System.out.println("Hello " + userLogin);
            }else {
                System.out.println("Incorrect password");
            }
        }else {
            System.out.println("Incorrect login");
        }
    }
}
