package condition;

public class Ex18 {
	public static void main(String[] args) {
		String input = "Madam";

        input = input.toLowerCase();

        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.substring(i, i + 1);
        }

        if (input.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }


}
