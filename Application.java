// import required classes and packages  
import java.util.*;  
  
// create class EconomicalNumber to get all the economical numbers in a given range  
public class EconomicalNumber {  
      
    // define max value  
    static int maxVal = 10000;  
  
    // create vector of Integer for storing primes <= to maxVal  
    static Vector<Integer> primeValues = new Vector<Integer>();  
  
    // create calculatePrimeValues() method to find primes  
    static void calculatePrimeValues()  
    {  
        // reduce max to half  
        boolean []mark = new boolean[maxVal / 2 + 1];  
          
        //logic for marking all the numbers that cannot generate prime number by performing 2*i+1  
        for (int i = 1; i <= (Math.sqrt(maxVal) - 1) / 2; i++){  
            for (int j = (i * (i + 1)) << 1; j <= maxVal / 2; j = j + 2 * i + 1) {  
                mark[j] = true;  
            }  
        }  
              
        // add 2 in the primeValues as it is a prime number  
        primeValues.add(2);  
  
        // add all other primes which are in the form 2*i + 1 such that mark[i] is false.  
        for (int i = 1; i <= maxVal / 2; i++) {  
            if (mark[i] == false) {  
                primeValues.add(2 * i + 1);  
            } 
code changes for release by Developer Mahesh
// find the total number of digits in the original number.  
        int realNumber = number;  
        int count = 0;  
        while (realNumber > 0) {  
            // increment the value of count  
            count++;  
              
            // remove last digit from the number  
            realNumber = realNumber / 10;   
        }  