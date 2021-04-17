package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddOccurrencesInArrayTest {
	private OddOccurrencesInArray solution;
	private ArrayList<createData> testSets = new ArrayList<createData>();

	class createData {
		private int[] testArray;
		private int testUnpairedExpected;

		public int[] getTestArray() {
			return testArray;
		}

		public void setTestArray(int[] testArray) {
			this.testArray = testArray;
		}

		public int getTestUnpairedExpected() {
			return testUnpairedExpected;
		}

		public void setTestUnpairedExpected(int testUnpairedExpected) {
			this.testUnpairedExpected = testUnpairedExpected;
		}
	}

	@BeforeEach
	public void setUp() {
		solution = new OddOccurrencesInArray();

		createData testSet = new createData();
		testSet.setTestArray(new int[] { 9, 3, 9, 3, 9, 7, 9 });
		testSet.setTestUnpairedExpected(7);
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestArray(new int[] { 1, 2, 1, 3, 5, 2, 3 });
		testSet1.setTestUnpairedExpected(5);
		testSets.add(testSet1);

		// double pair matching
		createData testSet2 = new createData();
		testSet2.setTestArray(new int[] { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 });
		testSet2.setTestUnpairedExpected(5);
		testSets.add(testSet2);

		createData testSet3 = new createData();
		testSet3.setTestArray(new int[] { 1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000 });
		testSet3.setTestUnpairedExpected(5000000);
		testSets.add(testSet3);
	}

	@Test
	public void test() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestArray()), testSet.getTestUnpairedExpected());
			System.out.print("Calculated = " + solution.solution(testSet.getTestArray()));
			System.out.println(",  Expected = " + testSet.getTestUnpairedExpected());
		}
	}
}