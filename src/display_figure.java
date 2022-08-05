import java.util.Scanner;

public class display_figure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("1. Print isosceles triangle");
        System.out.println("Exit");
        System.out.println("Enter your choice: ");

        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i = 0; i < 3; i++){
                        for(int j = 1; j <= 6; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 2:
                    for (int i = 0; i <= 5; i++){
                        for(int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 3:
                    for(int i = 6; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
