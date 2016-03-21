/**
 * Created by Æóê on 21.03.2016.
 */
public class Step2_1 {
	public boolean booleanExpression(boolean a, boolean b, boolean c) {
		return (c & secretFunction())|(a ^ b);
	}

	public long longExpression(int a, int b, int c) {
		return (100_000_000_000L % a) >> b | (100 / c);
	}

	public boolean doubleExpression(double a, double b, double c) {
		double d =(Math.round((a+b)*10));
		// System.out.println(d);
		d = d / 10;
		// System.out.println(d);
		return d == c;
	}

	public static int flipBit(int value, int bitIndex) {
		return  (value^(1<<(bitIndex-1)));
	}
}
