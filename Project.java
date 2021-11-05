import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        System.out.println("Hello welcome to the Food App");
        System.out.println("Create your Password:-");

        Scanner input = new Scanner(System.in);
        String pass1 = input.next();

        System.out.println("Your Password is now:" + pass1);
        System.out.println("Please enter your Password:-");
        String pass2 = input.next();

        while (!pass2.equals(pass1)) {
            System.out.println("Wrong Password.Try Again");
            pass2 = input.next();
        }
        System.out.println("Welcome");
        System.out.println("Are you hungry? Yes or No");
        String ans1 = input.next();

        if (ans1.equals(("yes"))) {
            System.out.println("Choose what you want to eat between pizza, burger or fish?");
            String ans2 = input.next();

            while (!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")) {
                System.out.println("Sorry we do not have it what would you like between pizza, burger or fish");
                ans2 = input.next();
            }
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")) {
                System.out.println("Do you want Something to drink? Yes or No");
                String ans3 = input.next();

                while (!ans3.equals("yes") && !ans3.equals("no")) {
                    System.out.println("Wrong Command please try again");
                    ans3 = input.next();
                }
                if (ans3.equals("yes")) {
                    System.out.println("What would you like to drink coke or juice?");
                    String ans4 = input.next();

                    while (!ans4.equals("coke") && !ans4.equals("juice")) {
                        System.out.println("Sorry we don't have it what would you like between coke and juice: ");
                        ans4 = input.next();
                    }
                    if (ans4.equals("coke") || ans4.equals("juice")) {
                        System.out.println("Great you have ordered " + ans2 + "and" + ans4);
                    }
                    System.out.println("Please confirm your Password");
                    pass2 = input.next();

                    while (!pass2.equals(pass1)) {
                        System.out.println("Wrong Password.Try Again");
                        pass2 = input.next();
                    }
                    System.out.println("Thank yoy Your order is on it's way");
                } else {
                    System.out.println("You have ordered " + ans2);
                }
                System.out.println("Please confirm your Password");
                pass2 = input.next();

                while (!pass2.equals(pass1)) {
                    System.out.println("Wrong Password.Try Again");
                    pass2 = input.next();
                }
            }
        } else {
            System.out.println("Alright have a good day");
        }
    }

}