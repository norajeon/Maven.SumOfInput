/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {

        int number = getInputNumber();
        double sumStart = System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        double sumEnd = System.currentTimeMillis();
        double time1 = sumEnd - sumStart;


        double gaussianTimeStart = System.currentTimeMillis();
        int gauss = gaussianSumOfNumbers(number);
        double gaussianTimeEnd = System.currentTimeMillis();
        double extraTime = (gaussianTimeEnd - gaussianTimeStart);
        //System.out.println("Gaussian sum ran for " + extraTime + "ms.");
        System.out.println("Regular sum: " + sum);
        System.out.println("Extra credit sum: " + gauss);

        boolean isGaussianFaster = extraTime < time1;
        System.out.println(isGaussianFaster);

    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {

        int total = 0;
        for (int i = 0; i <= n; i++) {
            total = total + i;
        }
        return total;
    }

    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        // This method reads the number provided using keyboard
        int num = scan.nextInt();


        // Closing Scanner after the use
        scan.close();
        return num;
    }


    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {

        int number = (n * (n+1))/2;

        return number;

    }

}

   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.

