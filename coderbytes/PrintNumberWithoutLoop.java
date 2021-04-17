package coderbytes;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
	
	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void printNumber(int startNum, int endNum) {
		if (startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNumber(startNum, endNum);
		}
	}
	public static void printNumberStream(int startNum, int endNum) {
		IntStream.range(startNum, endNum).forEach(e -> System.out.println(e));
	}

	public static void main(String[] args) {
		printNum(1);
		printNumber(1, 100);
		printNumber(5, 10);
		printNumberStream(1, 101);
		printNumberStream(5, 11);

	}

}
