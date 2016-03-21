import java.util.Arrays;

/**
 * Created by Æóê on 21.03.2016.
 */
public class Test {
	public static boolean areAnagrams(String a, String b) {
		while(a.contains(" ")) {
			String replace = a.replace(" ", "");
			a = replace;
		}
		while(b.contains(" ")) {
			String replace = b.replace(" ", "");
			b = replace;
		}
		String apelsin = a.toLowerCase();
		String spaniel = b.toLowerCase();
		char[] apelsinArray = apelsin.toCharArray();
		char[] spanielArray = spaniel.toCharArray();
		Arrays.sort(apelsinArray);
		Arrays.sort(spanielArray);

		return (Arrays.equals(spanielArray, apelsinArray));
	}

	public static boolean isSumOfTwoSquares(int value) {
		for (int i = 0; i < 46340; i++){
			for (int j = 0; j < 46340; j++){
				if (value == i*i+j*j) return true;
			}
		}
		return false;
	}
}
