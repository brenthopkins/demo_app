package coderbytes;

import java.util.*;

public class CoinDeterminerTest {

	public static int CoinDeterminer(int number) { 
		int count = 0;
		int remainder = 0;
		if (number > 10) {
			count += number/11;
			remainder = number % 11;
			System.out.println("11 number = " + number + ", count = " + count + ", remainder = " + remainder);
		}
		if (remainder > 8) {
			count += remainder/9;
			remainder = number % 9;			
			System.out.println("9 count = " + count + ", remainder = " + remainder);
		}
		if (remainder > 6) {
			count += remainder/7;
			remainder = number % 7;			
			System.out.println("7 count = " + count + ", remainder = " + remainder);
		}
		if (remainder > 4) {
			count += remainder/5;
			remainder = number % 5;			
			System.out.println("5 count = " + count + ", remainder = " + remainder);
		}
		if (remainder > 0) {
			count += remainder;
		}
		return count;
//		int Coins = 0; 
//		while (true) {
//			if (number == 11 || number >= 16) {
//				number= number - 11;
//				Coins++;
//			} else if (number == 9 || number >= 14) {
//				number= number - 9;
//				Coins++;
//			} else if ((number >= 7) || number >= 12) {
//				number= number - 7;
//				Coins++;
//			} else if (number >=5) {
//				number= number - 5;
//				Coins++;
//			} else if (number >= 1) {
//				number= number - 1;
//				Coins++;
//			} else if (number == 0) {
//				break;
//			}
//		}
//		return Coins;
	}
	
	public static void main(String[] args) {
		System.out.println(CoinDeterminer(135)); 		// 13
		System.out.println();
		System.out.println(CoinDeterminer(13)); 		// 3
		System.out.println();
		System.out.println(CoinDeterminer(295)); 		// 27

	}

}
