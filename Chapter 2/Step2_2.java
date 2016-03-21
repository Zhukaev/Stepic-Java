/**
 * Created by Æóê on 21.03.2016.
 */
public class Step2_2 {
	public char charExpression(int a) {
		a = (char) a;
		char c = '\\';
		char r = (char) (c + a);
		return r;
	}

	public static boolean isPowerOfTwo(int value) {
		boolean b;
		int a = 1;
		int c = -1;
		if (value == 0)
			return (b=false);
		else{
			if (value > 0){
				for (int i = 0; i < 100; i++)
					if (a == value)
						return (b = true);
					else a = a * 2;
			}
			else {
				for (int i = 0; i < 100; i++)
					if (c == value)
						return (b = true);
					else c = c * (2);
			}
			return (false);
		}
	}
}
