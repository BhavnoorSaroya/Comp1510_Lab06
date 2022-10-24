package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * @author Bhavnoor Saroya
 * @version 0.0.1
 */
public class Factorial {

    public static void main(String[] args) {
        
        Scanner myscan = new Scanner(System.in);
        
        int num = -1;
        String j = "";
       
            while (num <= 0) {
                
                
                if (myscan.hasNextInt()){
                    num = myscan.nextInt();
                    if (num < 0) {
                        System.out.print("Enter a positve int: "); 
                        continue;
                    }
                    break;
                }
                else {
                    System.out.print("Enter an int, not a string: ");
                }
                myscan.next();
            }
    
            
            
            System.out.println(factorial(num));
    }
    
    
    
 
    
    
    
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else 
            return n*factorial(n-1);
    }

    
    
    
}




/* 
int num = -1;
String input = "";
while (input.length() < 1) {
    input =  myscan.next("");
    
}



int ans = 1;
while (num > 0) {
    ans = ans * num;
    num--;
    
}

System.out.println(ans);
*/   
