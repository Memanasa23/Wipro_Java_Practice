package com.wipro.Day3_24_07_2025;
import java.util.Scanner;

public class InvalidMonthDemo {

    static class InvalidMonthException extends Exception {
        public InvalidMonthException(String message) {
            super(message);
        }
    }

    
    public void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month! Please enter between 1 and 12.");
        } else {
            System.out.println("Valid month: " + month);
        }
    }

    
    public static void main(String[] args) {
        InvalidMonthDemo obj = new InvalidMonthDemo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int month = sc.nextInt();

        try {
            obj.checkMonth(month);
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program finished.");
        sc.close();
    }
}
