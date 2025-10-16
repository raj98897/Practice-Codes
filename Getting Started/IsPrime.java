public class IsPrime {
    public static void main(String[] args) {
        boolean is_prime = true;
        int n = 23;
        if(n <= 1){
            is_prime = false;

        }else{
            for(int i=2; i <= n/2; i++){
                if(n % i == 0){
                    is_prime = false;
                    break;
                }
            }
        }
        if(is_prime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime");
        }
    }
    
}
