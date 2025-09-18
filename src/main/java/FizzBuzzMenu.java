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
            for (int i = 1; i <= 100; i++) {
                if (user == 1) {
                    if (i%3 == 0){
                        System.out.print(i + " ");
                    }
                } else if (user == 2) {
                    if (i%5 == 0){
                        System.out.print(i + " ");
                    }
                } else if (user == 3) {
                    if (i%3 == 0 && i%5 == 0){
                        System.out.print(i + " ");
                    }
                }
            }
            if (user == 4) {
                Running = false;
                System.out.println("Bye.");
            }
        }
    }
}