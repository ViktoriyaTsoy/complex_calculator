public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers up to 1000:");

        for(int i = 2; i<=1000; i ++){
            if(isPrime(i)){
            System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int num){
        if(num <=1 ){
            return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
    }
}
    
    
    
    
    
    