public class PrimeCheck {
    public void checkPrime(int input) {

        System.out.println("--------------------");
        System.out.println("Input: " +input);

        if(input <= 0) {
            System.out.println("Not prime: input is less than or equal to 0");
            return;
        }

        if(input == 2) {
            System.out.println("Prime: special case");
            return;
        }

        if(input == 1) {
            System.out.println("Not prime: special case");
            return;
        }

        if(input%2 == 0) {
            System.out.println("Not prime: even");
            return;
        }

        for(int i=3; i<input/2; i+=2) {
            if(input%i == 0) {
                System.out.println("Checking range: 3 to "+(input/2-1));
                System.out.println("Not prime: "+i+" is a factor");
                return;
            }
        }
        System.out.println("Prime");
    }
}
