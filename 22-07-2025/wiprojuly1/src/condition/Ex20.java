package condition;
import java.util.Arrays;


public class Ex20 {
	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        boolean result = Arrays.equals(arr1, arr2);

        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
	}

}
