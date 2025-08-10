package condition;

public class Ex16 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
