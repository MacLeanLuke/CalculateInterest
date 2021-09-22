package academy.learnprogramming;

public class Main {

        public static void main(String[] args) {

                // write your code here
            System.out.println("10000 at 2% interest rate = " + calculateInterest(10000,2));

//            for(init;termination; increment){
//            }
            for(int i=0; i<5; i++){
                System.out.println("Loop " + i + " Hello!");
            }
            // udsing the for statemetn, call teh calculate interest method
            // with the amount of 1000 with an interest rate of 2,3,4,5,6,7 and 8
            for(int i = 1; i < 9; i++ ){
                // print the results to the console window.
                System.out.println("10000 at "+i+"% interest rate = " + calculateInterest(10000,i));
            }
            System.out.println("*********************");
            // udsing the for statemetn, call teh calculate interest method
            // with the amount of 1000 with an interest rate of 8 down to 2 percent
            for(int i = 8; i > 1; i-- ){
                // print the results to the console window.
                System.out.println("10000 at "+i+"% interest rate = " + calculateInterest(10000,i));
            }

            System.out.println("****************");

            // create a for statement using any range of numbers
            int primeCount = 0;
            for (int i = 1; i < 1000; i++){
                // Determin if hte number is a prime number using the isPrime method
                if (isPrime(i)){
                    // if it is a prime number print it out
                    System.out.println( i + " is a Prime number!");
                    //  Increment the count of hte number of prime numbers found
                    primeCount++;
                    if (primeCount == 3){
                        break;
                    }
                }
            }
        }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*interestRate/100);
    }
    public static boolean isPrime(int n){
            if (n==1){
                return false;
            }
            for (int i=2; i <= n/2; i++){
                if (n% i == 0){
                    return false;
                }
            }
            return true;
    }
}
