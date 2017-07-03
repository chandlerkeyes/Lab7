import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String yOrN = "";
        System.out.println("Welcome to our Java Class. Which student would you like to learn about?");
        Lab7Methods methodAccess = new Lab7Methods();
        do {
            methodAccess.userInfo(Validator.getInt(keyboard, "Enter a number between 1 - 10: ", 1, 10));
            System.out.println("Want information on another student? (y/n):");
            yOrN = keyboard.nextLine();
            yOrN = methodAccess.yOrNValid(yOrN);

        } while (yOrN.equalsIgnoreCase("y"));
        System.out.println("Thanks for your time.");
    }
}




