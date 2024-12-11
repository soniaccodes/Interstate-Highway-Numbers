import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int highwayNumber;
        int primaryNumber;

        System.out.println("Enter Highway Number: ");
        highwayNumber = scnr.nextInt();
        int rightmostDigit = highwayNumber % 100; // divides the variable by 100 and returns the remainder

        if (highwayNumber == 0 || rightmostDigit == 0) {
            System.out.println(highwayNumber + " is not a valid interstate highway number");
            return;
        }

        if ((highwayNumber > 1) && (highwayNumber <= 99)) {
            if (highwayNumber % 2 != 0) {
                System.out.println("I-" + highwayNumber + " is primary, going north/south");
            } else if (highwayNumber % 2 == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west");
            }
        }
        else if (highwayNumber > 99 && highwayNumber <= 999) {
            // int rightmostDigit = highwayNumber % 100;
            if (rightmostDigit % 2 != 0) {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + rightmostDigit + ", going north/south");
            }
            else {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + rightmostDigit + ", going east/west");
            }
        }


    }
}


