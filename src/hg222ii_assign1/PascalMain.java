package hg222ii_assign1;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class PascalMain {

    public static void main(String[] args){

        try {

            //the number scanned has to be an int in the span of 0-10
            Scanner scan = new Scanner(System.in);
            System.out.println("Write a number between 0 and 10: ");
            int number = scan.nextInt();

            scan.close();

            if (number > 10) { //throw exception if mismatch
                throw new InputMismatchException();
            }

            int[] nthLine = computePascal(number);

            System.out.println(toString(nthLine));

        } catch(InputMismatchException e){ //throw exception if mismatch

            System.err.println(e + ": Please only type in a number between 0 and 10!");
        }
    }

    private static int[] computePascal(int n) { //recursive method to compute the sum

        if (n == 0) { 
            int[] firstArrayPascal = new int[1];
            firstArrayPascal[0] = 1;   //setting index 0 to 1 as the first number

            return firstArrayPascal;

        } else {

            int[] lastNumber = computePascal(n - 1);
            int[] nextNumber = calculateArray(lastNumber);

            return nextNumber;
        }
    }

    public static int[] calculateArray(int[] r) { //method to compute the next line
        int[] arr = new int[r.length + 1];

        arr[0] = 1;       // first and last is always 1
        arr[r.length] = 1;

        for (int i = 1; i < r.length; i++) { //always need to start with index 1
            arr[i] = r[i - 1] + r[i];
        }

        return arr;
    }

    public static String toString(int[] in) { //method to print out the last line
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < in.length; i++) {
            str.append(" " + in[i]);
        }

        return str.toString();
    }
}