public class Driver {
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
    }
}
