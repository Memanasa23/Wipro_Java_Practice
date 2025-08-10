package condition;

public class Ex7 {
	public static void main(String[] args) {
		
        double num1 = 25.589;
        double num2 = 25.586;

        long value1 = Math.round(num1 * 1000);
        long value2 = Math.round(num2 * 1000);

        System.out.println("First Input: " + num1);
        System.out.println("Second Input: " + num2);

        if (value1 == value2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

}
