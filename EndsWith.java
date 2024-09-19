import java.util.Scanner;

public class EndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the ending string:");
        String endingString = scanner.nextLine();

        boolean endsWith = mainString.endsWith(endingString);

        System.out.println("\"" + mainString + "\" ends with \"" + endingString + "\"? " + endsWith);

        scanner.close();
    }
}

