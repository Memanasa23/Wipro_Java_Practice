package condition;

public class Ex11 {
	public static void main(String[] args) {
		int[] numbers = {3, 7, 1, 9, 4, 6};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println("Array after double:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
 
	}

}
