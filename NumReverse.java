/**
 * Olivia Rutkowski. APCSA
 */

public class NumReverse {
    public static void main(String args[]){
        int n1 = 3455;
        int n2 = 8767;
        int n3 = 2468;
     
        System.out.println("The original number is " + n1 + ". The reverse is ");
        
        int ones = n1 % 10;
        int tens = (n1 / 10) % 10;
        int hundreds = (n1 / 100) % 10;
        int thousands = (n1 / 1000) % 10;
        
        int reversed = (ones * 1000) + (tens * 100) + (hundreds * 10) + thousands;
        
        System.out.println(reversed);

        System.out.println("The original number is " + n2 + ". The reverse is ");
        
        
        int ones1 = n2 % 10;
        int tens1 = (n2 / 10) % 10;
        int hundreds1 = (n2 / 100) % 10;
        int thousands1 = (n2 / 1000) % 10;
        
        int reversed1 = (ones1 * 1000) + (tens1 * 100) + (hundreds1 * 10) + thousands1;
        
        System.out.println(reversed1);
        
        System.out.println("The original number is " + n3 + ". The reverse is ");
        
        
        int ones2 = n3 % 10;
        int tens2 = (n3 / 10) % 10;
        int hundreds2 = (n3 / 100) % 10;
        int thousands2 = (n3 / 1000) % 10;
        
        int reversed2 = (ones2 * 1000) + (tens2 * 100) + (hundreds2 * 10) + thousands2;
        
        System.out.println(reversed2);

         
    }
}
