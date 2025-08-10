package com.wipro.stream;

import java.util.Optional;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Optional<Integer> s = Optional.ofNullable(42);

        s.ifPresent(val -> System.out.println(val));
        
        Optional<Integer> t = Optional.empty();
        Integer res = t.orElse(-1);
        System.out.println(res);
        
	}

}
