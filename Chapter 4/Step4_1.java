public class Step4_1 {
	public static double sqrt(double x) throws IllegalArgumentException {
		if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got " + x);

		return Math.sqrt(x); // your implementation here
	}

	public static String getCallerClassAndMethodName() {
		String a = "main";
		if (new Throwable().getStackTrace().length <= 2) return null;
			//else if (a.equals(Thread.currentThread().getStackTrace()[2].getMethodName())) return null;
		else return (new Throwable().getStackTrace()[2].getClassName() + "#" + new Throwable().getStackTrace()[2].getMethodName());

	}
}
