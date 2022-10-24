package ca.bcit.comp1510.lab06;


/**
 * Name class. Plz kill me already 
 * @author Bhavnoor Saroya
 * @version 0.0.1
 * 
 * */
public class Name {
    /**
     * firstname variable.
     */
    
    private String first;
    /**
     * middlename variable.
     */
    
    private String middle;
    /**
     * lastname varible.
     */
    
    private String last;
    /**
     * name constructor.
     * @param fir firstname
     * @param mid middlename
     * @param las lastbnmae
     * 
     */
    
    public Name(String fir, String mid, String las) {
        if (fir.isBlank() || fir.isEmpty()) {
            fir = "Sukhraj";
        }
        if (mid.isBlank() || mid.isEmpty()) {
            mid = "Singh";
        }
        if (las.isBlank() || las.isEmpty()) {
            las = "Sidhu";
        }
        first = fir;
        middle = mid;
        last = las;
    }
    /**
     * get first method.
     * @return first
     */ 
    
    public String getFirst() {
        
        return first;
    }
    /**
     * set first method.
     * @param fir firstname
     */
    
    public void setFirst(String fir) {
        
        if (fir.isBlank() || fir.isEmpty()) {
            return;
        }
        
        first = fir.substring(0, 1).toUpperCase()
                + (fir.substring(1, fir.length()).toLowerCase());
    }
    /**
     * get middle method.
     * @return middlename
     */
    
    public String getMiddle() {
        return middle;
    }
    /**
     * set middle method.
     * @param mid middle
     */
    
    public void setMiddle(String mid) {
        if (mid.isBlank() || mid.isEmpty()) {
            return;
        }
        middle = mid;
        middle = mid.substring(0, 1).toUpperCase()
                + (mid.substring(1, mid.length()).toLowerCase());
    }
    /**
     * get last method. 
     * @return lastname
     */
    
    public String getLast() {
        return last;
    }
    
    /**
     * set last method. 
     * @param las lastname
     */
    
    public void setLast(String las) {
        if (las.isBlank() || las.isEmpty()) {
            return;
        }
        
        last = las;
        last = las.substring(0, 1).toUpperCase()
                + (las.substring(1, las.length()).toLowerCase());
    }

    
    /**
    * len of names.
    * 
    * @return len as a int.
    */
    public int sumLengths() {
        return first.length() + middle.length() + last.length();
    }
    
    
    
    /**
     * initials method.
     * @return initals
     */
    public String initials() {
        String x = ("" + first.charAt(0) + middle.charAt(0) + last.charAt(0)).
                toUpperCase();
        return x;
    }
    
    
    /**
     * Returns the nth character of this full name.
     * 
     * @param n th letter to return.
     * @return nth char as char
     */
    public char getNCharacter(int n) {
        if (n > toString().length() - 1) {
            return '@';
        }
        return toString().charAt(n - 1);
        
    }
    
    
    /**
     * change order.
     * 
     * @return fullName as a String
     */
    public String fullName() {
        return last + ", " + first + " " + middle;
    }
    
    /**
     * string method.
     * 
     * @param str string.
     * @return is boolean.
     */
    public boolean isEqual(String str) {
        return first.equals(str);
    }
    
    /**
    * object check.
    * 
    * @param name name.
    * @return boolean true or false
    */
    public boolean isEqualtoNameObj(Name name) {
        return this.first.equals(name.getFirst())
                && this.middle.equals(name.getMiddle()) 
                && this.last.equals(name.getLast());
    }
    
    
    
    
    /**
     * to string method. 
     * @return fullname
     */
    
    public String toString() {
        String fullname = (first + " " + middle + " " + last);
        return fullname;

    }
    
    
    
    
    
    
    
    
}
