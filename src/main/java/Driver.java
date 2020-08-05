public class Driver {
    /**
     * Solution 3: Utilizing Math.log for logical solution to if number is power of 4
     * Java Math.pow return double which should be compared using epsilon
     * @param num int input num
     * @return boolean is power of 4
     */
    public boolean isPowerOfFour(int num) {
        if(num < 1) return false;

        int logBase4 = (int) (Math.log(num) / Math.log(4)); // reordering log base 4 of x
        double result = Math.abs(Math.pow(4, logBase4) - num);
        return (result < 1e-11); // comparison using episilon since Math.pow returns double
    }

    /**
     * Solution 2: Bit Manipulation to determine if power of 2
     * Based on if only 1 bit is set
     * and if that bit is in an odd position
     * @param num int input num
     * @return boolean is power of 4
     */
    /*
    public boolean isPowerOfFour(int num) {
        int bitCount = Integer.bitCount(num);

        if(bitCount == 1) { // powers of 4 will have only 1 bit set
            int shifted = 0;
            while (num > 0) {
                num = num >> 1;
                shifted++;
            }
            return ((shifted % 2) == 1); // number of shifts must be odd
        }
        return false;
    }
     */


    /**
     * Solution 1: Naive Solution to loop through dividing by 4
     * and checking mod 4 to see if any remainder
     * @param num input number
     * @return boolean is power of 4
     */
    /*
    public boolean isPowerOfFour(int num) {
        // handling edge scenario
        if(num == 1) return true;

        // logic
        while(num != 4){
            if(num < 4) return false;
            if((num % 4) != 0) return false;

            num /= 4;
        }
        return true;
    }
    */

    public static void main(String[] args) {
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(16);
            System.out.println(result); // true
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(5);
            System.out.println(result); // false
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(64);
            System.out.println(result); // true
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(63);
            System.out.println(result); // false
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(17);
            System.out.println(result); // false
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(0);
            System.out.println(result); // false
        }
        {
            Driver d = new Driver();
            boolean result = d.isPowerOfFour(-5);
            System.out.println(result); // false
        }
    }
}
