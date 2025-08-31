package condition;

public class Ex14 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		
        int a = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[a] = arr[i];
                a++;
            }
        }
        
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
