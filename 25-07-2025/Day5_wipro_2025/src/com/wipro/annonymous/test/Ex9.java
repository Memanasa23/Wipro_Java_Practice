package com.wipro.annonymous.test;

import java.util.function.Function;

public class Ex9 {

	public static void main(String[] args) {
		Function<Double, String> Res = n -> String.format("%.2f", n - Math.floor(n));

        
        double a = 123.45;
        String b = Res.apply(a);
        
        System.out.println("Fractional part " + b);
		

        

	}

}
