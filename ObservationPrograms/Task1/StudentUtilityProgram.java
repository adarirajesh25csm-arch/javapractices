import java.util.Scanner;
public class StudentUtilityProgram {
static long factorial(int n) {
    long fact = 1;

    for (int i = 1; i <= n; i++) {
        fact *= i;
    }

    return fact;
}

static boolean isPrime(int n) {
    if (n < 2) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

static int maximum(int a, int b) {
    return Math.max(a, b);
}

static double areaOfCircle(double radius) {
    return Math.PI * radius * radius;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
        System.out.println("1. Part A - Student Information");
        System.out.println("2. Part B - Conditional Statements");
        System.out.println("3. Part C - Looping Statements");
        System.out.println("4. Part D - Methods");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();

                System.out.println("\n--- PART A: STUDENT INFORMATION ---");

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Roll Number: ");
                int rollNo = sc.nextInt();

                int total = 0;

                for (int i = 1; i <= 5; i++) {
                    System.out.print("Enter marks of Subject " + i + ": ");
                    total += sc.nextInt();
                }

                double percentage = total / 5.0;

                System.out.println("\n--- STUDENT RESULT ---");
                System.out.println("Name       : " + name);
                System.out.println("Roll Number: " + rollNo);
                System.out.println("Total Marks: " + total);
                System.out.printf("Percentage : %.2f%%%n", percentage);
                System.out.println("Result     : " + (percentage >= 40 ? "PASS" : "FAIL"));
                break;

            case 2:
                int bChoice;

                do {
                    System.out.println("\n--- PART B: CONDITIONAL STATEMENTS ---");
                    System.out.println("1. Even or Odd");
                    System.out.println("2. Largest of Three Numbers");
                    System.out.println("3. Display Grade");
                    System.out.println("4. Day of the Week");
                    System.out.println("5. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    bChoice = sc.nextInt();

                    switch (bChoice) {
                        case 1:
                            System.out.print("Enter a number: ");
                            int num = sc.nextInt();
                            System.out.println(num + (num % 2 == 0 ? " is Even." : " is Odd."));
                            break;

                        case 2:
                            System.out.print("Enter first number: ");
                            int a = sc.nextInt();

                            System.out.print("Enter second number: ");
                            int b = sc.nextInt();

                            System.out.print("Enter third number: ");
                            int c = sc.nextInt();

                            System.out.println("Largest = " + Math.max(a, Math.max(b, c)));
                            break;

                        case 3:
                            System.out.print("Enter percentage: ");
                            double percentage = sc.nextDouble();

                            if (percentage >= 90) {
                                System.out.println("Grade: A+");
                            } else if (percentage >= 80) {
                                System.out.println("Grade: A");
                            } else if (percentage >= 70) {
                                System.out.println("Grade: B");
                            } else if (percentage >= 60) {
                                System.out.println("Grade: C");
                            } else if (percentage >= 50) {
                                System.out.println("Grade: D");
                            } else if (percentage >= 40) {
                                System.out.println("Grade: E");
                            } else {
                                System.out.println("Grade: F");
                            }
                            break;

                        case 4:
                            System.out.print("Enter day number (1-7): ");
                            int day = sc.nextInt();

                            switch (day) {
                                case 1:
                                    System.out.println("Monday");
                                    break;
                                case 2:
                                    System.out.println("Tuesday");
                                    break;
                                case 3:
                                    System.out.println("Wednesday");
                                    break;
                                case 4:
                                    System.out.println("Thursday");
                                    break;
                                case 5:
                                    System.out.println("Friday");
                                    break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                case 7:
                                    System.out.println("Sunday");
                                    break;
                                default:
                                    System.out.println("Invalid day number.");
                            }
                            break;

                        case 5:
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (bChoice != 5);
                break;

            case 3:
                int cChoice;

                do {
                    System.out.println("\n--- PART C: LOOPING STATEMENTS ---");
                    System.out.println("1. Multiplication Table");
                    System.out.println("2. Display 1 to N");
                    System.out.println("3. Sum of First N Natural Numbers");
                    System.out.println("4. Fibonacci Series");
                    System.out.println("5. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    cChoice = sc.nextInt();

                    switch (cChoice) {
                        case 1:
                            System.out.print("Enter a number: ");
                            int table = sc.nextInt();

                            System.out.println("Multiplication Table of " + table);

                            for (int i = 1; i <= 10; i++) {
                                System.out.println(table + " x " + i + " = " + (table * i));
                            }
                            break;

                        case 2:
                            System.out.print("Enter N: ");
                            int n = sc.nextInt();

                            int i = 1;
                            while (i <= n) {
                                System.out.print(i + " ");
                                i++;
                            }
                            System.out.println();
                            break;

                        case 3:
                            System.out.print("Enter N: ");
                            int limit = sc.nextInt();

                            int sum = 0;
                            int j = 1;

                            if (limit > 0) {
                                do {
                                    sum += j;
                                    j++;
                                } while (j <= limit);
                            }

                            System.out.println("Sum = " + sum);
                            break;

                        case 4:
                            System.out.print("Enter number of terms: ");
                            int terms = sc.nextInt();

                            int first = 0;
                            int second = 1;

                            System.out.print("Fibonacci Series: ");

                            for (int k = 1; k <= terms; k++) {
                                System.out.print(first + " ");

                                int next = first + second;
                                first = second;
                                second = next;
                            }

                            System.out.println();
                            break;

                        case 5:
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (cChoice != 5);
                break;

            case 4:
                int dChoice;

                do {
                    System.out.println("\n--- PART D: USER-DEFINED METHODS ---");
                    System.out.println("1. Factorial");
                    System.out.println("2. Prime Check");
                    System.out.println("3. Maximum of Two Numbers");
                    System.out.println("4. Area of Circle");
                    System.out.println("5. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    dChoice = sc.nextInt();

                    switch (dChoice) {
                        case 1:
                            System.out.print("Enter a non-negative number: ");
                            int factNum = sc.nextInt();

                            if (factNum < 0) {
                                System.out.println("Factorial is not defined for negative numbers.");
                            } else {
                                System.out.println("Factorial = " + factorial(factNum));
                            }
                            break;

                        case 2:
                            System.out.print("Enter a number: ");
                            int primeNum = sc.nextInt();

                            System.out.println(
                                primeNum + (isPrime(primeNum) ? " is Prime." : " is Not Prime.")
                            );
                            break;

                        case 3:
                            System.out.print("Enter first number: ");
                            int x = sc.nextInt();

                            System.out.print("Enter second number: ");
                            int y = sc.nextInt();

                            System.out.println("Maximum = " + maximum(x, y));
                            break;

                        case 4:
                            System.out.print("Enter radius: ");
                            double radius = sc.nextDouble();

                            if (radius < 0) {
                                System.out.println("Radius cannot be negative.");
                            } else {
                                System.out.printf(
                                    "Area of Circle = %.2f%n",
                                    areaOfCircle(radius)
                                );
                            }
                            break;

                        case 5:
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }
                } while (dChoice != 5);
                break;

            case 5:
                System.out.println("\nThank you for using Student Utility Program.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    } while (choice != 5);

    sc.close();
}
}
