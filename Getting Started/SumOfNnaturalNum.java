public class SumOfNnaturalNum {
    public static void main(String[] args) {
        int n = 10;
        // using loop
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);

        // Using formula
        System.out.println(n*(n+1)/2);

        // Using Recursion
        int result = getSum(n);
        System.out.println(result);
        
    }
    static int getSum(int n){
            if(n == 0) return n;
            return n + getSum(n -1);
        }
    
}
