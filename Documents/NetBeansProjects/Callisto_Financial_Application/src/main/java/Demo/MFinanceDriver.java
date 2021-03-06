package Demo;

import Model.LoanHistory;
import Util.CredentialCheck;
import java.util.Scanner;

/**
 * A class that drives the application by giving the base options when the user
 * chooses how they want to proceed with their experience.
 */
public class MFinanceDriver {

    private String menuChoice;
    private Scanner scanner = new Scanner(System.in);
    CredentialCheck credentialCheck = new CredentialCheck();
    private String username;
    private String password;
    LoanHistory history = LoanHistory.getInstance();

    /**
     * Calls the method that displays the app options.
     */
    public void beginApp() {

        selectOption();

    }

    /**
     * Displays the options the user can select and asks them for credentials to
     * continue.
     */
    public void selectOption() {
        try {
            do {
                System.out.println("\n1) Employee Login\n"
                        + "2) Customer Login\n"
                        + "3) Exit mFinance\n");

                System.out.print("Choice: ");

                menuChoice = scanner.next();

                switch (menuChoice) {
                    case "1":
                        System.out.print("Enter Employee Username: ");
                        username = scanner.next();
                        System.out.print("Enter Employee Password: ");
                        password = scanner.next();

                        if (credentialCheck.verifyCredentials(username, password) == true) {
                            System.out.println("Welcome " + username + "!\n");
                            displayEmployeeOptions();
                        } else {
                            System.out.println("Invalid Credentials!");
                        }
                        break;
                    case "2":
                        System.out.print("Enter Customer Username: ");
                        username = scanner.next();
                        System.out.print("Enter Customer Password: ");
                        password = scanner.next();

                        if (credentialCheck.verifyCredentials(username, password) == true) {
                            System.out.println("Welcome " + username + "!\n");
                            displayCustomerOptions();
                        } else {
                            System.out.println("Invalid Credentials!");
                        }
                        break;
                    case "3":
                        System.out.println("\nGoodbye");
                        break;
                    default:
                        System.err.println("Please enter a valid menu option!");
                }
            } while (!"3".equals(menuChoice));
        } catch (Exception e) {
            System.out.println("Invalid Option Selected!");
        }
    }

    /**
     * Will display a list of options for the employee to interact with customer
     * information.
     */
    public void displayEmployeeOptions() {
        System.out.println("Not Implemented Yet!");
    }

    /**
     * Will display a list of options for the customer to requests loans and
     * make payments.
     */
    public void displayCustomerOptions() {
        System.out.println("Not Implemented Yet!");

    }

}
