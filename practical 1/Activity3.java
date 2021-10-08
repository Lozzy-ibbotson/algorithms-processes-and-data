package practical1;

import java.util.Random;

public class Activity3 {
    /**
     * Activity 3:
     * Create and initialise two arrays, called A and B,
     * with each array containing ten integers (specified during
     * initialisation). Create an array C with capacity for
     * ten doubles. At each index i, store into C[i] the division
     * of A[i] by B[i]. Calculate the sum of all values, the
     * minimum, maximum and average value within array C.
     *
     * Answer each of the following questions:
     *
     * 1.Are the elements in array C stored as expected?
     *
     * 2.Can you optimise your implementation in order to use
     * only one for loop?
     */

    public static void processArrays(int[] A, int[] B){
        double[] C =  new double[10];
        String cForDisplay = "";
        if(A.length == B.length){   //prevent index out of range error
            //populate array C with each element == A/B elements in the same index
            for(int x =0; x < A.length; x ++){
                double currentDouble = (double) A[x] / B[x];
                C[x] = currentDouble;
                cForDisplay += currentDouble + ", ";
            }
            System.out.println(cForDisplay);

            //calculate the sum of all values
            double minimum = C[0];
            double maximum = C[0];
            double average = 0;
            for(int i = 1; i < C.length; i ++){
                if(minimum > C[i]){
                    minimum = C[i];
                }
                if(maximum < C[i]){
                    maximum = C[i];
                }
                average += C[i];
            }
            average /= C.length;
            System.out.println("the minimum is: " + minimum);
            System.out.println("the maximum is: " + maximum);
            System.out.println("the average is: " + average);
        }else{
            System.out.println("Created arrays have unequal lengths");
        }

    }

    /*
    public int[] populateArray(int[] arr){
        Random rand = new Random();
        for(int x = 0; x < arr.length; x ++){
            int randInt = rand.nextInt(100);
            arr[x] = randInt;
        }
        return arr;
    }

     */

    public static void main(String[] args) {
        int[] A = {124, 117, 478, 786, 111, 325, 422, 145, 523, 33};
        int[] B = {8, 9, 17, 4, 68, 56, 38, 77, 81, 2};

        processArrays(A, B);

    }
}
