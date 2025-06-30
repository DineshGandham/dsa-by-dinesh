public class PrimeNumbers {
  
/**
 * Prints all prime numbers between 1 and 100.
 * 
 * This method iterates through numbers from 2 to 100, checking each number to
 * determine if it is prime. A number is considered prime if it is greater than 1
 * and has no divisors other than 1 and itself. The method prints each prime number
 * found during the iteration.
 */
  public void primeNumbers() {
    boolean isPrime = true;
    for(int num=2;num<=100;num++) {
      for(int i=2;i<=num/2;i++) {
        if(num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.println(num + " ");
      }
    }
  }

/** * Checks if a given number is prime and prints the result.
 * * This method takes an integer as input and checks if it is a prime number.
 * * A prime number is defined as a number greater than 1 that has no divisors  other than 1 and itself.
 * * The method prints whether the number is prime or not.                              
 * * @param num the number to check for primality
 * */  

  public void isPrimeNumber(int num) {
    boolean isPrime = true;
    if (num <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= num/2; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
}