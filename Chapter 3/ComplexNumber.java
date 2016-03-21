public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}

	public boolean equals(Object b) {
		if (b instanceof ComplexNumber) {
			ComplexNumber cnb = (ComplexNumber)b;
			return (this.re == cnb.getRe() && this.im == cnb.getIm());}
		else return false;
	}

	public int hashCode(){
		double result = (this.re%1+this.im%1);
		int result1 = (int) result;
		return (result1);
	}
}