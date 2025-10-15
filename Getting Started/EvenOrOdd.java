public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        // Ternary Operator
        String result = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(result);
    }
    
}
