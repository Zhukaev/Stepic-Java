import java.math.BigInteger;
import java.util.Arrays;

public class Step2_4 {
	public static BigInteger factorial(int value) {
		BigInteger ret = BigInteger.ONE;
		for (int i = 1; i <= value; i++)
			ret = ret.multiply(BigInteger.valueOf(i));
		return ret;
	}

	public static int[] mergeArrays(int[] a1, int[] a2) {

		int a1l = a1.length;
		int a2l = a2.length;
		int[] a3 = new int[a1l+a2l];
		for (int i = 0; i < a1l; i++)
			a3[i]=a1[i];
		for (int j = 0; j < a2l; j++)
			a3[j+a1l]=a2[j];
		Arrays.sort(a3);
		return (a3);
	}
}
