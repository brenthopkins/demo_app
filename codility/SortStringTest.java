package codilityTest;

import org.junit.jupiter.api.Test;

class SortStringTest {
	
	private SortString testSort;
	String[] testSet = new String[7];
	{
	testSet[0] = "Brent".toLowerCase();
	testSet[1] = "Kyle".toLowerCase();
	testSet[2] = "Natasha".toLowerCase();
	testSet[3] = "artichoke".toLowerCase();
	testSet[4] = "hashbrowns".toLowerCase();
	testSet[5] = "eggs and bacon".toLowerCase();
	testSet[6] = "Lexie".toLowerCase();
	}

	@Test
	void test() {
		testSort.main(testSet);
	}

}
