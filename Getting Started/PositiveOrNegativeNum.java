import java.util.Scanner;
class PositiveOrNegativeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Brute force method
        if(num >= 0){
            System.out.println(num+" is a positive number");
        }else if(num < 0){
            System.out.println(num + " is a negative number.");
        }else{
            System.out.println("Zero");
        }

        // Nested loop
        if(num > 0){
            if(num == 0){
                System.out.println("Zeor");
            }else{
                System.out.println("Positive");
            }
        }else{
            System.out.println("Negative");
        }

        // Ternary Operater
        sc.close();

    }
}