import java.util.Scanner;
/*
 * Author: Hojjat Shabab
 *
 * Created on April 14, 2021, 1:00 PM
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("welcome to the prime numbers program!");
        System.out.println("Please enter number...");
        Scanner myScanner = new Scanner(System.in);
        Integer num = myScanner.nextInt();

        if (isPrime(num))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false; //false is not a prime number
        for (int i = 2; i < Math.sqrt(num); i++) {  // you can use num and num/2 instead of Math.sqrt(num)
            if (num % i == 0)
                return false;
        }
        return true; //false is a prime number
    }
    //******************************* you can use while() instead of for(;;)*****************************************//
    private static boolean isPrimenum(int num){
        if (num < 2 )
            return false;
        int i = 2;
        while(i<num/2){
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }
    //********************************** you can use do...while() instead of for(;;) and while()***************************//
    private static boolean isPrimes(int num){
        if (num < 2 )
            return  false;
        int i = 2;
        do{
            if (num % i == 0)
                return false;
            i++;
        }while(i < num);
        return true;
    }
}
