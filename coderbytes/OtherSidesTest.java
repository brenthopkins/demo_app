package coderbytes;

import java.text.DecimalFormat;
import java.util.Arrays;

public class OtherSidesTest {
	 private static DecimalFormat df = new DecimalFormat("0.00");
	 
	public static double[] otherSides(double num) {
		double[] target = new double[2];
		target[0] = num * 2;
		target[1] = Double.valueOf(df.format(num * Math.sqrt(3)));
		return target;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(otherSides(1)));  //  [2.0, 1.73]
		System.out.println(Arrays.toString(otherSides(12))); //  [24.0, 20.0]
		System.out.println(Arrays.toString(otherSides(2)));  //  [4.0, 3.46]
		System.out.println(Arrays.toString(otherSides(3)));  //  [6.0, 5.2]
	}

}
