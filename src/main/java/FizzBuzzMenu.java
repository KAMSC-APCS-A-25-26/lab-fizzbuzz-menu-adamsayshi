import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Running = true;
        while (Running) {
            System.out.println("\n-----FizzBuzz Menu-----");
            System.out.println("1. Fizz\n2. Buzz\n3. FizzBuzz\n4. Exit");
            System.out.println("Enter your Choice:  ");
            int user = sc.nextInt();

                switch(user) {
                        case 1:
                            for (int i = 1; i <= 100; i++) {
                                if (i % 3 == 0) {
                                    System.out.print(i + " ");
                                }
                            }
                            break;
                        case 2:
                            for (int i = 1; i <= 100; i++) {
                                if (i % 5 == 0) {
                                    System.out.print(i + " ");
                                }
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= 100; i++) {
                                if (i % 3 == 0 && i % 5 == 0) {
                                    System.out.print(i + " ");
                                }
                            }
                            break;
                        case 4:
                            Running = false;
                            System.out.println("Bye.");
                            break;
                        default:
                            System.out.println("what");
                            break;
                }
            }
        }
    }
