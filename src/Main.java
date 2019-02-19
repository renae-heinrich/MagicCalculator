import java.math.RoundingMode;
import java.util.Scanner;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~\nWelcome to the magic year calculator!\n");
        System.out.print("Please input your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please input your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your annual salary: ");
        String annualSalary = scanner.nextLine();
        System.out.print("Please enter your work start year: ");
        String workYear = scanner.nextLine();
        System.out.print("\n");

//        String fullName = firstName + " " + lastName;
//

        double annualSalaryNumber = Double.parseDouble(annualSalary);
//
//        BigDecimal monthlySalary = BigDecimal.valueOf(annualSalaryNumber / 12);
//
//
        int workYearNumber = Integer.parseInt(workYear);
//
//        int magicYear = workYearNumber + 65;

        String result = Calculator.calculate(firstName, lastName, annualSalaryNumber, workYearNumber);


        System.out.println(result);
//        System.out.println("Name: " + fullName);
//        System.out.println("Monthly Salary: " + monthlySalary.setScale(0, RoundingMode.HALF_UP));
//        System.out.println("Magic Year: " + magicYear);
//        System.out.println("~~~");

    }
}

//Ceiling Floor rounding decide whether which one to use