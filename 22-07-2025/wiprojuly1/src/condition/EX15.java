package condition;

public class EX15 {
	public static void main(String[] args) {
		
		int[] n = {2, 7, 11, 15};
        int t = 9;

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == t) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
		
	
	}
	

}
