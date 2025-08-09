package com.wipro.Exception;

public class Ex7 {

	public static void main(String[] args) {
		String fname = null; 

        try {
            
            String name_upper = fname.toUpperCase();
            System.out.println("Uppercase: " + name_upper);
            
        } catch (NullPointerException ex) {
        	
            System.out.println("Thrown a NullPointerException: name is null.");
        }

	}

}
