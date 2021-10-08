package practical4;
/**Activity 1
 Give a Big-O characterization, in terms of n, of the running time of the
 example1,example2, example3, example4 and example5 methods below
 */
public class Activity1 {
    /* Example 1
       3 instructions before loop, (initialization of all variables, including j), complexity O(1) constant time
       loop contains 3 instructions (this includes the comparative statement); it's checked each loop cycle (test, body step)
       the loop iterates n times O(3n) complexity
       1 instruction after the loop O(1) constant time

       --> overall method complexity is O(n) as it's the greatest complexity (linear time)
    */
    public static int example1 (int[] arr){
        //Returns the sum of the integers in given array.
        int n = arr.length, total =0;
        for(int j=0; j<n; j++){ //loops from 0 to n-1
            total += arr[j];
        }
        return total;
    }

    /* Example 2
        3 instructions before loop, (initialization of all variables, including j), complexity O(1) constant time
        loop contains 3 instructions, (test, body and step)
        loop iterates half as often as example1 as the step value is 2 therefore O(3/2 n) (linear time)
        1 instruction after the loop O(1) constant time

        -->overall method complexity is O(n) as it's the greatest complexity (linear time)
     */
    public static int example2(int[ ] arr) {
        //Returns the sum of the integers with even index in given array
        int n = arr.length, total = 0;
        for (int j=0; j < n; j += 2) {// note the increment of 2
            total += arr[j];
        }
        return total;
    }

    /* Example 3
        3 instructions before loop, (initialization of all variables, including j), complexity O(1) constant time
        loop contains  3 iterative instructions and a nested loop which contains 3 iterative instructions
            as the loops use a shared counter variable (j), they cannot be considered independently
            inner loop has complexity O(3n) linear time
            outer loop has complexity 3 + 3n(n)
            overall loop complexity is 3 + 3n^2 --> O(1) + O(n^2)
            = O(n^2)
        1 instruction after the loop O(1) constant time

        -->overall method complexity is O(n^2) as it's the greatest complexity (polynomial time)
     */
    public static int example3(int[ ] arr) {
        //Returns the sum of the prefix sums of given array.
        int n = arr.length, total = 0;
        for (int j = 0; j < n; j++){ // loop from 0 to n-1
            for (int k = 0; k <= j; k++){ // loop from 0 to j
                total += arr[j];
            }
        }
        return total;
    }

    /* Example 4
        4 instructions before loop, (initialization of all variables, including j), complexity O(1) constant time
        loop contains 4 instructions (this includes the comparative statement; it's checked each loop cycle (test, body step)
        the loop iterates n times O(4n) complexity (linear time)
        1 instruction after the loop O(1) constant time

        -->overall method complexity is O(n) as it's the greatest complexity (linear time)
    */
    public static int example4(int[ ] arr) {
        //Returns the sum of the prefix sums of given array.
        int n = arr.length, prefix = 0, total = 0;
        for (int j = 0; j < n; j++) { // loop from 0 to n-1
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }

    /* Example 5
        3 instructions before loop, (initialization of all variables, including j), complexity O(1) constant time

        outer loop contains 3 iterative instructions and a nested loop (middle loop)
        middle loop contains 5 iterative instructions (assume the condition is entered) and a nested loop (inner loop)
        inner loop contains 3 iterative instructions O(3n) linear time

        --> inner loop O(3n)
        --> middle loop O(3n^2) + O(5)
        --> outer loop O(3n^3) + O(3)

        1 instruction after the loop O(1) constant time

        -->overall method complexity is O(3n^3) as it's the greatest complexity (polynomial time)
     */
    //Returns the number of times second array stores sum of prefix sums from first.
    public static int example5(int[ ] first, int[ ] second) { // assume equal-length arrays
        int n = first.length, count = 0;
        for (int i = 0; i < n; i++) { // loop from 0 to n-1
            int total = 0;
            for (int j = 0; j < n; j++) {// loop from 0 to n-1
                for (int k = 0; k <= j; k++) {// loop from 0 to j
                    total += first[k];
                }
                if (second[i] == total) {
                    count++;
                }
            }
        }
        return count;
    }
}
