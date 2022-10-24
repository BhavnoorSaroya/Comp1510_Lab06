
package ca.bcit.comp1510.lab06;

import java.util.Random;
 
/**
 * @author Bhavnoor Saroya
 *
 */
public class Mathematics2 {

    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * Square area method, return the area of a square of given side length.
     * @param length
     * @return area
     */
    public double getSquareArea(double length) {
        return (length * length);
    }

    /**
     * add method, returns the sum of the two operands.
     * @param operand1
     * @param operand2
     * @return sum
     */
    public double add(double operand1, double operand2) {
        
        return (operand1 + operand2);
    }

    /**
     * multiply method, returns product of the given operands.
     * @param operand1
     * @param operand2
     * @return product
     */
    public double multiply(double operand1, double operand2) {
        
        return (operand1 * operand2);
    }

    /**
     * subtract method, retruns the difference of the given operands. 
     * @param operand1
     * @param operand2
     * @return difference
     */
    public double subtract(double operand1, double operand2) {
        
        return (operand1 - operand2);
    }

    /**
     * divide method, returns the quotient of the numbers, if the second 
     * operand is zero, the method returns 0 instead of Nan or infinity.
     * @param operand1
     * @param operand2
     * @return quotient
     */
    public double divide(double operand1, double operand2) {
        if (operand2 <= 0) {
            return 0.0;
        }
        return (operand1 / operand2);
    }

    /**
     * absolute value method, returns absolute value of given int.
     * @param i
     * @return absolute value of i
     */
    public int absoluteValue(int i) {
        if (i < 0) {
            return -i;
        }
        return i;
    }

    /**
     * rand num method, can not return 15. 
     * @return randnum
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int randnum = 15; 
        Random rand = new Random();
        while (randnum == 15) {
            randnum = rand.nextInt(11)+ 10;    
        }
        return randnum;
        
    }

    /**
     * feet to km method, converts feet to km and returns value
     * @param d
     * @return 
     */
    public double convertFeetToKilometres(double d) {
        
        return d * FOOT_TO_KILOMETRE_RATIO;
    }

    /**
     * @param i
     * @param j
     * @return
     */
    public int sumOfProducts(int bound, int divisor) {
        int i = 0;
        int total = 0;
        if (bound > 0) {
            while (i <= bound) {
                total += i;
                i = i + divisor;
            }
        } 
        else {
            while (i >= bound) {
                total += i;
                i = i - divisor;
            }
        }
        return total;
    }

}
