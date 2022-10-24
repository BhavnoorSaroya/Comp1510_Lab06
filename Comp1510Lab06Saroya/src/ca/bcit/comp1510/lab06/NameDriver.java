package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * @author Bhavnoor Saroya
 * @version 0.0.1
 *
 */
public class NameDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner myscan = new Scanner(System.in);
        
        Name nameobj =  new Name("", "", "");
        
        System.out.println("First Name: " + nameobj.getFirst());
        
        System.out.println("Middle Name: " + nameobj.getMiddle());
        
        System.out.println("Last Name: " + nameobj.getLast());
        
        
        nameobj.setLast("");
        
        nameobj.setFirst("");
        
        nameobj.setMiddle("");
        
        System.out.println("\n\nFirst Name: " + nameobj.getFirst());
        
        System.out.println("Middle Name: " + nameobj.getMiddle());
        
        System.out.println("Last Name: " + nameobj.getLast());
        
        System.out.println("Enter first name value: ");
        String input = myscan.nextLine();
        nameobj.setFirst(input);
        if (input.equalsIgnoreCase(nameobj.getFirst())) {
            System.out.println("Your firstname value was set");
        }
        else {
            System.out.println("input was not valid, and therefore not set");
        }
        
        System.out.println("Enter middle name value: ");
        input = myscan.nextLine();
        nameobj.setMiddle(input);
        if (input.equalsIgnoreCase(nameobj.getMiddle())) {
            System.out.println("Your Middlename value was set");
        }
        else {
            System.out.println("input was not valid, and therefore not set");
        }
        
        
        System.out.println("Enter last name value: ");
        input = myscan.nextLine();
        nameobj.setLast(input);
        if (input.equalsIgnoreCase(nameobj.getLast())) {
            System.out.println("Your Lastname value was set");
        }  
        else {
            System.out.println("input was not valid, and therefore not set");
        }
        
    }

}
