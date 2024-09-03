/**
 * Olivia Rutkowski. AP CSA. Sep 3 2024
 */
public class NumericalOperations{
    public static void main(String args[]){
        
        String prob1 = "Problem 1: 79 + 3 * (4 + 82 - 68) - 7 + 19 = ";
      
        String prob2 = "Problem 2: (179 + 21 + 10)/7 + 181 = ";
    
        String prob3 = "Problem 3: 10389 * 56 * 11 + 2246 = ";

        double ans1 = 79 + 3 * (4 + 82 - 68) - 7 + 19;
        
        String result1 = prob1 + ans1;
        
        double ans2 = (179 + 21 + 10)/7 + 181;
        
        String result2 = prob2 + ans2;
        
        double ans3 = 10389 * 56 * 11 + 2246;
        
        String result3 = prob3 + ans3;
        
        System.out.println(result1);
        
        System.out.println(result2);
        
        System.out.println(result3);
    }
}