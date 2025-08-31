package condition;

public class EX6 {
	public static void main(String[] args) {
        double number = 0.33333;
        System.out.println("Input value: " + number);
        
        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }

            double absValue = Math.abs(number);
            if (absValue < 1) {
                System.out.println(" and small");
            } else if (absValue > 1000000) {
                System.out.println(" and large");
            } else {
                System.out.println();
            }
        }
    }

}
