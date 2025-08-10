package condition;

public class Ex13 {
	    public static void main(String[] args) {

	        int[] arr = {10, 5, 20, 8, 15};

	        int a = -99999;
	        int b = -99999;

	        for (int num : arr) {
	            if (num > a) {
	                b = a;
	                a = num;
	            } else if (num > b && num != a) {
	                b = num;
	            }
	        }

	        if (b == a) {
	            System.out.println("Not second largest element");
	        } else {
	            System.out.println(b);
	        }
	    }


}
