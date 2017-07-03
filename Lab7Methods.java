import java.util.Scanner;

/**
 * Created by chand on 7/1/2017.
 */
public class Lab7Methods {
    public static void userInfo(int userInput) {
        switch (userInput) {
            case 1:
                studentCase(userInput);
                break;
            case 2:
                studentCase(userInput);
                break;
            case 3:
                studentCase(userInput);
                break;
            case 4:
                studentCase(userInput);
                break;
            case 5:
                studentCase(userInput);
                break;
            case 6:
                studentCase(userInput);
                break;
            case 7:
                studentCase(userInput);
                break;
            case 8:
                studentCase(userInput);
                break;
            case 9:
                studentCase(userInput);
                break;
            case 10:
                studentCase(userInput);
                break;
        }
    }

    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }


    public static String ageOrHomeValid(String ageOrHome) {
        Scanner keyboard = new Scanner(System.in);
        while (!(ageOrHome.equalsIgnoreCase("age")) && !(ageOrHome.equalsIgnoreCase("hometown"))) {
            System.out.println("Please enter 'age' or 'hometown': ");
            ageOrHome = keyboard.nextLine();
        }
        return ageOrHome;
    }

    public static void studentCase(int userInput) {
        Scanner keyboard = new Scanner(System.in);
        String[] studentNames = {"Bob", "Joseph", "Ashley", "Becky", "Carl", "Samantha", "Brenden", "Mei", "Collin", "Brad"};
        int[] studentAge = {18, 19, 19, 17, 15, 16, 19, 20, 23, 15};
        String[] studentTown = {"Detroit, Michigan", "Orlando, Florida", "Ypsilanti, Michigan", "Detroit, Michigan",
                "Houston, Texas", "Austin, Texas", "Sandusky, Ohio", "Beijing, China", "Ann Arbor, Michigan", "Flint, Michigan"};
        System.out.println("Student " + userInput + " is " + studentNames[userInput - 1] + ". What would you like to" +
                " know about " + studentNames[userInput - 1] + "?");
        System.out.println("Enter 'age' or 'hometown':");
        String ageOrHome = keyboard.nextLine();
        ageOrHome = ageOrHomeValid(ageOrHome);

        if (ageOrHome.equalsIgnoreCase("age")) {
            System.out.println(studentNames[userInput - 1] + " is " + studentAge[userInput - 1] + " years old.");
        } else {
            System.out.println(studentNames[userInput - 1] + " is from " + studentTown[userInput - 1] + ".");
        }
    }
}
