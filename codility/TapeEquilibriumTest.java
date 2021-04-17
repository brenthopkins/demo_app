package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

	private TapeEquilibrium solution;
	private ArrayList<createData> testSets = new ArrayList<createData>();

	class createData {
		private int[] testArray;
		private int testExpected;

		public int[] getTestArray() {
			return testArray;
		}

		public void setTestArray(int[] testArray) {
			this.testArray = testArray;
		}

		public int getTestExpected() {
			return testExpected;
		}

		public void setTestExpected(int testExpected) {
			this.testExpected = testExpected;
		}
	}

	@BeforeEach
	void setUp() throws Exception {
		solution = new TapeEquilibrium();

		createData testSet = new createData();
		testSet.setTestArray(new int[] { 3, 1, 2, 4, 3 });
		testSet.setTestExpected(1);
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestArray(new int[] { -3, 1, 2, -4, 3 });
		testSet1.setTestExpected(1);
		testSets.add(testSet1);

		createData testSet2 = new createData();
		testSet2.setTestArray(new int[] { 5, 2, 7, 10 });
		testSet2.setTestExpected(4);
		testSets.add(testSet2);

		createData testSet3 = new createData();
		testSet3.setTestArray(new int[] { -1000, 1000, -500, 990 });
		testSet3.setTestExpected(490);
		testSets.add(testSet3);

		createData testSet4 = new createData();
		testSet4.setTestArray(new int[] { 1, 2 });
		testSet4.setTestExpected(1);
		testSets.add(testSet4);

		createData testSet5 = new createData();
		testSet5.setTestArray(new int[] { 100, -25 });
		testSet5.setTestExpected(125);
		testSets.add(testSet5);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestArray()), testSet.getTestExpected());
		}
	}

}