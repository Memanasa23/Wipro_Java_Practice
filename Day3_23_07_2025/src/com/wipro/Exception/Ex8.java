package com.wipro.Exception;

public class Ex8 {
	public static double changeCurrency(double no) throws NumberFormatException {
        if (no == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return no * 80;
    }

    public static void main(String[] args) {
        try {
            double st = 0; 
            double opt = changeCurrency(st);
            System.out.println("Converted amount " + opt);
            
        } catch (NumberFormatException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
    }

}
