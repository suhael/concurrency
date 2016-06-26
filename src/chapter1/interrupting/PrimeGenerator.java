package chapter1.interrupting;

/**
 * Created by sakhtar on 18/06/2014.
 */
public class PrimeGenerator extends Thread {
    public void run(){
        long number = 1L;
        while(true){
            if(isPrime(number)){
                System.out.printf("Number %d is Prime\n", number);
            }
            if(isInterrupted()){
                System.out.printf("The prime number generator has been interrupted\n");
                return;
            }
            number++;
        }
    }
    private boolean isPrime(long number) {
        if (number <=2) {
            return true;
        }
        for (long i=2; i<number; i++){
            if ((number % i)==0) {
                return false;
            }
        }
        return true;
    }
}
