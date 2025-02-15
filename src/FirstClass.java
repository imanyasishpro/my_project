public class FirstClass {
    public static void main(String[] arg){

        for ( int n = 2; n <= 20; n++) {
            boolean isPrime = isPrimeNumber(n);

            if (isPrime) {
                System.out.println(n + " is a prime number");
            }else {
                System.out.println(n + " is NOT a prime number");
            }
        }
    }

    public static boolean isPrimeNumber (int number) {

        for (int i = 2; i < number && i < 10 ; i++ ){
            double primCal = number % i ;
            if(primCal == 0.00) {
                return false;
            }
        }
        return true;
    }

}
