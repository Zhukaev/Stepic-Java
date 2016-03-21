/**
 * Created by Æóê on 21.03.2016.
 */
public class Step2_3 {
	public static boolean isPalindrome(String text) {
		text = text.toLowerCase();
		StringBuffer txet = new StringBuffer(text);
		txet.reverse();
		String txet1 = txet.toString();
		String txet2 = txet1.replaceAll("\\W", "");
		String text1 = text.replaceAll("\\W", "");
		//System.out.println(txet2);
		//System.out.println(text1);

		return(text1.equals(txet2));
	}
}
