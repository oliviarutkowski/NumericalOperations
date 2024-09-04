/**
Olivia Rutkowski. APCSA
 */
public class ModulusCalc {
    public static void main(String args[]){
        
        // This will find the modulus of 1234 / 10 = 4!
        int number1 = 1234;
        int mod1 = 10;
        int remainder2 = (number1 - mod1 * (number1 / mod1));
        System.out.println(remainder2);

        // This will print modulus of -2312 / 33 = -2.
        int number2 = -2312;
        int mod2 = 33;
        int remainder3 = (number2 - mod2 * (number2 / mod2));
        System.out.println(remainder3);
        
        // This finds the modulus of 101010 / 2, which = 0.
        int number = 101010;
        int mod = 2;
        int remainder1 = (number - mod * (number / mod));
        System.out.println(remainder1);


        /**
         * Implement your algorithm for calculating the modulus of any number 
         * without using the modulus operator.  For the above numbers, the result 
         * should be 101.  Test your algorithm against other values too! 
         */
    }
}
