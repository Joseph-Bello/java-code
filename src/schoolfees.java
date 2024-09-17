import java.util.Scanner;

public class schoolfees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("What's your matric number? ");
        String matricNumber = scanner.nextLine();

        System.out.println("What's your department? ");
        String department = scanner.nextLine();

        System.out.println("What's your year of study? ");
        int year = scanner.nextInt();

        int bursaryAllowancePercentage = 0;
        int schoolFees = 100000; // Declare schoolFees before the if-else if block

        // if (year == 1) {
        //     bursaryAllowancePercentage = 10;
        // } else if (year == 2) {
        //     bursaryAllowancePercentage = 25;
        // } else if (year == 3) {
        //     bursaryAllowancePercentage = 50;
        // } else if (year == 4) {
        //     bursaryAllowancePercentage = 75;
        // } else if (year == 5) {
        //     bursaryAllowancePercentage = 120;
        // } else {
        //     System.out.println("ERROR!!!");
        // }


        switch (year) {
            case 1:
                bursaryAllowancePercentage = 10;
                break;
            case 2:
                bursaryAllowancePercentage = 25;
                break;
            case 3:
                bursaryAllowancePercentage = 50;
                break;
            case 4:
                bursaryAllowancePercentage = 75;
                break;
            case 5:
                bursaryAllowancePercentage = 120;
                break;
            default:
                System.out.println("ERROR!!! Invalid year of study.");
                break;
        }




            int bursaryAllowance = (int) ((double) schoolFees * bursaryAllowancePercentage / 100);


        System.out.println(name);
        System.out.println(matricNumber);
        System.out.println(department);
        System.out.println(year);
        System.out.println("Your bursary allowance is " + bursaryAllowance);
    }
}
