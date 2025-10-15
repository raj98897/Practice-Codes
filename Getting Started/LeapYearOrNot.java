public class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 1989;
        // Using if-else
        if(year % 400 == 0){
            System.out.println("Leap year");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap year");
        }

        // Ternary Operator
        String result = ((year % 400 == 0) && (year % 4 ==0 || year % 100 != 0))? "Leap":"Not Leap";
        System.out.println(result);
    }
    
}
