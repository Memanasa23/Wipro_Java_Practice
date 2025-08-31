package condition;

public class Ex22 {
	public static void main(String[] args) {
		String str = "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase";
		String[] word = str.split(" ");

        String shorts = word[0];

        for (int i = 1; i < word.length; i++) {
            if (word[i].length() < shorts.length()) {
                shorts = word[i];
            }
        }
        
        if shorts

        System.out.println(shorts);
	}

}
